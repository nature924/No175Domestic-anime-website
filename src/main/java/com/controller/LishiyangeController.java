
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 历史沿革
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lishiyange")
public class LishiyangeController {
    private static final Logger logger = LoggerFactory.getLogger(LishiyangeController.class);

    private static final String TABLE_NAME = "lishiyange";

    @Autowired
    private LishiyangeService lishiyangeService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表非注册的service
    //注册表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = lishiyangeService.queryPage(params);

        //字典表数据转换
        List<LishiyangeView> list =(List<LishiyangeView>)page.getList();
        for(LishiyangeView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LishiyangeEntity lishiyange = lishiyangeService.selectById(id);
        if(lishiyange !=null){
            //entity转view
            LishiyangeView view = new LishiyangeView();
            BeanUtils.copyProperties( lishiyange , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody LishiyangeEntity lishiyange, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lishiyange:{}",this.getClass().getName(),lishiyange.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<LishiyangeEntity> queryWrapper = new EntityWrapper<LishiyangeEntity>()
            .eq("lishiyange_name", lishiyange.getLishiyangeName())
            .eq("lishiyange_types", lishiyange.getLishiyangeTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LishiyangeEntity lishiyangeEntity = lishiyangeService.selectOne(queryWrapper);
        if(lishiyangeEntity==null){
            lishiyange.setInsertTime(new Date());
            lishiyange.setCreateTime(new Date());
            lishiyangeService.insert(lishiyange);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LishiyangeEntity lishiyange, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,lishiyange:{}",this.getClass().getName(),lishiyange.toString());
        LishiyangeEntity oldLishiyangeEntity = lishiyangeService.selectById(lishiyange.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<LishiyangeEntity> queryWrapper = new EntityWrapper<LishiyangeEntity>()
            .notIn("id",lishiyange.getId())
            .andNew()
            .eq("lishiyange_name", lishiyange.getLishiyangeName())
            .eq("lishiyange_types", lishiyange.getLishiyangeTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LishiyangeEntity lishiyangeEntity = lishiyangeService.selectOne(queryWrapper);
        if("".equals(lishiyange.getLishiyangePhoto()) || "null".equals(lishiyange.getLishiyangePhoto())){
                lishiyange.setLishiyangePhoto(null);
        }
        if(lishiyangeEntity==null){
            lishiyangeService.updateById(lishiyange);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<LishiyangeEntity> oldLishiyangeList =lishiyangeService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        lishiyangeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<LishiyangeEntity> lishiyangeList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            LishiyangeEntity lishiyangeEntity = new LishiyangeEntity();
//                            lishiyangeEntity.setLishiyangeName(data.get(0));                    //标题 要改的
//                            lishiyangeEntity.setLishiyangeTypes(Integer.valueOf(data.get(0)));   //内容类型 要改的
//                            lishiyangeEntity.setLishiyangePhoto("");//详情和图片
//                            lishiyangeEntity.setInsertTime(date);//时间
//                            lishiyangeEntity.setLishiyangeContent("");//详情和图片
//                            lishiyangeEntity.setCreateTime(date);//时间
                            lishiyangeList.add(lishiyangeEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        lishiyangeService.insertBatch(lishiyangeList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = lishiyangeService.queryPage(params);

        //字典表数据转换
        List<LishiyangeView> list =(List<LishiyangeView>)page.getList();
        for(LishiyangeView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LishiyangeEntity lishiyange = lishiyangeService.selectById(id);
            if(lishiyange !=null){


                //entity转view
                LishiyangeView view = new LishiyangeView();
                BeanUtils.copyProperties( lishiyange , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody LishiyangeEntity lishiyange, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,lishiyange:{}",this.getClass().getName(),lishiyange.toString());
        Wrapper<LishiyangeEntity> queryWrapper = new EntityWrapper<LishiyangeEntity>()
            .eq("lishiyange_name", lishiyange.getLishiyangeName())
            .eq("lishiyange_types", lishiyange.getLishiyangeTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LishiyangeEntity lishiyangeEntity = lishiyangeService.selectOne(queryWrapper);
        if(lishiyangeEntity==null){
            lishiyange.setInsertTime(new Date());
            lishiyange.setCreateTime(new Date());
        lishiyangeService.insert(lishiyange);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}
