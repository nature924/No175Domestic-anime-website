package com.dao;

import com.entity.DongmanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanLiuyanView;

/**
 * 国漫先驱留言 Dao 接口
 *
 * @author 
 */
public interface DongmanLiuyanDao extends BaseMapper<DongmanLiuyanEntity> {

   List<DongmanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
