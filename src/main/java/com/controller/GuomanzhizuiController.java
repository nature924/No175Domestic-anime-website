
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
 * 国漫之最
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/guomanzhizui")
public class GuomanzhizuiController {
    private static final Logger logger = LoggerFactory.getLogger(GuomanzhizuiController.class);

    private static final String TABLE_NAME = "guomanzhizui";

    @Autowired
    private GuomanzhizuiService guomanzhizuiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private GuomanzhizuiCollectionService guomanzhizuiCollectionService;
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
        params.put("guomanzhizuiDeleteStart",1);params.put("guomanzhizuiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = guomanzhizuiService.queryPage(params);

        //字典表数据转换
        List<GuomanzhizuiView> list =(List<GuomanzhizuiView>)page.getList();
        for(GuomanzhizuiView c:list){
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
        GuomanzhizuiEntity guomanzhizui = guomanzhizuiService.selectById(id);
        if(guomanzhizui !=null){
            //entity转view
            GuomanzhizuiView view = new GuomanzhizuiView();
            BeanUtils.copyProperties( guomanzhizui , view );//把实体数据重构到view中
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
    public R save(@RequestBody GuomanzhizuiEntity guomanzhizui, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,guomanzhizui:{}",this.getClass().getName(),guomanzhizui.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<GuomanzhizuiEntity> queryWrapper = new EntityWrapper<GuomanzhizuiEntity>()
            .eq("guomanzhizui_name", guomanzhizui.getGuomanzhizuiName())
            .eq("guomanzhizui_types", guomanzhizui.getGuomanzhizuiTypes())
            .eq("guomanzhizui_video", guomanzhizui.getGuomanzhizuiVideo())
            .eq("guomanzhizui_shijian", guomanzhizui.getGuomanzhizuiShijian())
            .eq("guomanzhizui_faxing", guomanzhizui.getGuomanzhizuiFaxing())
            .eq("guomanzhizui_add", guomanzhizui.getGuomanzhizuiAdd())
            .eq("guomanzhizui_gs", guomanzhizui.getGuomanzhizuiGs())
            .eq("chuchang_time", new SimpleDateFormat("yyyy-MM-dd").format(guomanzhizui.getChuchangTime()))
            .eq("guomanzhizui_sc", guomanzhizui.getGuomanzhizuiSc())
            .eq("guomanzhizui_jishu", guomanzhizui.getGuomanzhizuiJishu())
            .eq("guomanzhizui_daoyan", guomanzhizui.getGuomanzhizuiDaoyan())
            .eq("zhuangtai_types", guomanzhizui.getZhuangtaiTypes())
            .eq("guomanzhizui_delete", guomanzhizui.getGuomanzhizuiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GuomanzhizuiEntity guomanzhizuiEntity = guomanzhizuiService.selectOne(queryWrapper);
        if(guomanzhizuiEntity==null){
            guomanzhizui.setGuomanzhizuiDelete(1);
            guomanzhizui.setInsertTime(new Date());
            guomanzhizui.setCreateTime(new Date());
            guomanzhizuiService.insert(guomanzhizui);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GuomanzhizuiEntity guomanzhizui, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,guomanzhizui:{}",this.getClass().getName(),guomanzhizui.toString());
        GuomanzhizuiEntity oldGuomanzhizuiEntity = guomanzhizuiService.selectById(guomanzhizui.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<GuomanzhizuiEntity> queryWrapper = new EntityWrapper<GuomanzhizuiEntity>()
            .notIn("id",guomanzhizui.getId())
            .andNew()
            .eq("guomanzhizui_name", guomanzhizui.getGuomanzhizuiName())
            .eq("guomanzhizui_types", guomanzhizui.getGuomanzhizuiTypes())
            .eq("guomanzhizui_video", guomanzhizui.getGuomanzhizuiVideo())
            .eq("guomanzhizui_shijian", guomanzhizui.getGuomanzhizuiShijian())
            .eq("guomanzhizui_faxing", guomanzhizui.getGuomanzhizuiFaxing())
            .eq("guomanzhizui_add", guomanzhizui.getGuomanzhizuiAdd())
            .eq("guomanzhizui_gs", guomanzhizui.getGuomanzhizuiGs())
            .eq("chuchang_time", new SimpleDateFormat("yyyy-MM-dd").format(guomanzhizui.getChuchangTime()))
            .eq("guomanzhizui_sc", guomanzhizui.getGuomanzhizuiSc())
            .eq("guomanzhizui_jishu", guomanzhizui.getGuomanzhizuiJishu())
            .eq("guomanzhizui_daoyan", guomanzhizui.getGuomanzhizuiDaoyan())
            .eq("zhuangtai_types", guomanzhizui.getZhuangtaiTypes())
            .eq("guomanzhizui_delete", guomanzhizui.getGuomanzhizuiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GuomanzhizuiEntity guomanzhizuiEntity = guomanzhizuiService.selectOne(queryWrapper);
        if("".equals(guomanzhizui.getGuomanzhizuiPhoto()) || "null".equals(guomanzhizui.getGuomanzhizuiPhoto())){
                guomanzhizui.setGuomanzhizuiPhoto(null);
        }
        if("".equals(guomanzhizui.getGuomanzhizuiVideo()) || "null".equals(guomanzhizui.getGuomanzhizuiVideo())){
                guomanzhizui.setGuomanzhizuiVideo(null);
        }
        if(guomanzhizuiEntity==null){
            guomanzhizuiService.updateById(guomanzhizui);//根据id更新
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
        List<GuomanzhizuiEntity> oldGuomanzhizuiList =guomanzhizuiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<GuomanzhizuiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            GuomanzhizuiEntity guomanzhizuiEntity = new GuomanzhizuiEntity();
            guomanzhizuiEntity.setId(id);
            guomanzhizuiEntity.setGuomanzhizuiDelete(2);
            list.add(guomanzhizuiEntity);
        }
        if(list != null && list.size() >0){
            guomanzhizuiService.updateBatchById(list);
        }

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
            List<GuomanzhizuiEntity> guomanzhizuiList = new ArrayList<>();//上传的东西
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
                            GuomanzhizuiEntity guomanzhizuiEntity = new GuomanzhizuiEntity();
//                            guomanzhizuiEntity.setGuomanzhizuiName(data.get(0));                    //动漫名称 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiTypes(Integer.valueOf(data.get(0)));   //国漫之最类型 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiPhoto("");//详情和图片
//                            guomanzhizuiEntity.setGuomanzhizuiVideo(data.get(0));                    //介绍视频 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiShijian(data.get(0));                    //更新时间 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiFaxing(data.get(0));                    //出品公司 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiAdd(data.get(0));                    //地    区 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiGs(data.get(0));                    //发行公司 要改的
//                            guomanzhizuiEntity.setChuchangTime(sdf.parse(data.get(0)));          //发行日期 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiSc(data.get(0));                    //单集时长 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiJishu(data.get(0));                    //集    数 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiDaoyan(data.get(0));                    //导    演 要改的
//                            guomanzhizuiEntity.setZhuangtaiTypes(Integer.valueOf(data.get(0)));   //动漫状态 要改的
//                            guomanzhizuiEntity.setGuomanzhizuiContent("");//详情和图片
//                            guomanzhizuiEntity.setGuomanzhizuiDelete(1);//逻辑删除字段
//                            guomanzhizuiEntity.setInsertTime(date);//时间
//                            guomanzhizuiEntity.setCreateTime(date);//时间
                            guomanzhizuiList.add(guomanzhizuiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        guomanzhizuiService.insertBatch(guomanzhizuiList);
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
    * 个性推荐
    */
    @IgnoreAuth
    @RequestMapping("/gexingtuijian")
    public R gexingtuijian(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("gexingtuijian方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        CommonUtil.checkMap(params);
        List<GuomanzhizuiView> returnGuomanzhizuiViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = guomanzhizuiCollectionService.queryPage(params1);
        List<GuomanzhizuiCollectionView> collectionViewsList =(List<GuomanzhizuiCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(GuomanzhizuiCollectionView collectionView:collectionViewsList){
            Integer guomanzhizuiTypes = collectionView.getGuomanzhizuiTypes();
            if(typeMap.containsKey(guomanzhizuiTypes)){
                typeMap.put(guomanzhizuiTypes,typeMap.get(guomanzhizuiTypes)+1);
            }else{
                typeMap.put(guomanzhizuiTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("guomanzhizuiTypes",type);
            PageUtils pageUtils1 = guomanzhizuiService.queryPage(params2);
            List<GuomanzhizuiView> guomanzhizuiViewList =(List<GuomanzhizuiView>)pageUtils1.getList();
            returnGuomanzhizuiViewList.addAll(guomanzhizuiViewList);
            if(returnGuomanzhizuiViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = guomanzhizuiService.queryPage(params);
        if(returnGuomanzhizuiViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnGuomanzhizuiViewList.size();//要添加的数量
            List<GuomanzhizuiView> guomanzhizuiViewList =(List<GuomanzhizuiView>)page.getList();
            for(GuomanzhizuiView guomanzhizuiView:guomanzhizuiViewList){
                Boolean addFlag = true;
                for(GuomanzhizuiView returnGuomanzhizuiView:returnGuomanzhizuiViewList){
                    if(returnGuomanzhizuiView.getId().intValue() ==guomanzhizuiView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnGuomanzhizuiViewList.add(guomanzhizuiView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnGuomanzhizuiViewList = returnGuomanzhizuiViewList.subList(0, limit);
        }

        for(GuomanzhizuiView c:returnGuomanzhizuiViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnGuomanzhizuiViewList);
        return R.ok().put("data", page);
    }

    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = guomanzhizuiService.queryPage(params);

        //字典表数据转换
        List<GuomanzhizuiView> list =(List<GuomanzhizuiView>)page.getList();
        for(GuomanzhizuiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GuomanzhizuiEntity guomanzhizui = guomanzhizuiService.selectById(id);
            if(guomanzhizui !=null){


                //entity转view
                GuomanzhizuiView view = new GuomanzhizuiView();
                BeanUtils.copyProperties( guomanzhizui , view );//把实体数据重构到view中

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
    public R add(@RequestBody GuomanzhizuiEntity guomanzhizui, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,guomanzhizui:{}",this.getClass().getName(),guomanzhizui.toString());
        Wrapper<GuomanzhizuiEntity> queryWrapper = new EntityWrapper<GuomanzhizuiEntity>()
            .eq("guomanzhizui_name", guomanzhizui.getGuomanzhizuiName())
            .eq("guomanzhizui_types", guomanzhizui.getGuomanzhizuiTypes())
            .eq("guomanzhizui_video", guomanzhizui.getGuomanzhizuiVideo())
            .eq("guomanzhizui_shijian", guomanzhizui.getGuomanzhizuiShijian())
            .eq("guomanzhizui_faxing", guomanzhizui.getGuomanzhizuiFaxing())
            .eq("guomanzhizui_add", guomanzhizui.getGuomanzhizuiAdd())
            .eq("guomanzhizui_gs", guomanzhizui.getGuomanzhizuiGs())
            .eq("guomanzhizui_sc", guomanzhizui.getGuomanzhizuiSc())
            .eq("guomanzhizui_jishu", guomanzhizui.getGuomanzhizuiJishu())
            .eq("guomanzhizui_daoyan", guomanzhizui.getGuomanzhizuiDaoyan())
            .eq("zhuangtai_types", guomanzhizui.getZhuangtaiTypes())
            .eq("guomanzhizui_delete", guomanzhizui.getGuomanzhizuiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GuomanzhizuiEntity guomanzhizuiEntity = guomanzhizuiService.selectOne(queryWrapper);
        if(guomanzhizuiEntity==null){
            guomanzhizui.setGuomanzhizuiDelete(1);
            guomanzhizui.setInsertTime(new Date());
            guomanzhizui.setCreateTime(new Date());
        guomanzhizuiService.insert(guomanzhizui);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}
