package com.dao;

import com.entity.GuomanzhizuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuomanzhizuiView;

/**
 * 国漫之最 Dao 接口
 *
 * @author 
 */
public interface GuomanzhizuiDao extends BaseMapper<GuomanzhizuiEntity> {

   List<GuomanzhizuiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
