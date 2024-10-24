package com.dao;

import com.entity.GuomanzhizuiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuomanzhizuiLiuyanView;

/**
 * 国漫之最留言 Dao 接口
 *
 * @author 
 */
public interface GuomanzhizuiLiuyanDao extends BaseMapper<GuomanzhizuiLiuyanEntity> {

   List<GuomanzhizuiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
