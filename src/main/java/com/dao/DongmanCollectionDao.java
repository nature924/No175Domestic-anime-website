package com.dao;

import com.entity.DongmanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanCollectionView;

/**
 * 国漫先驱收藏 Dao 接口
 *
 * @author 
 */
public interface DongmanCollectionDao extends BaseMapper<DongmanCollectionEntity> {

   List<DongmanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
