package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DongmanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 国漫先驱
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dongman")
public class DongmanView extends DongmanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 国漫先驱类型的值
	*/
	@ColumnInfo(comment="国漫先驱类型的字典表值",type="varchar(200)")
	private String dongmanValue;
	/**
	* 动漫状态的值
	*/
	@ColumnInfo(comment="动漫状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;




	public DongmanView() {

	}

	public DongmanView(DongmanEntity dongmanEntity) {
		try {
			BeanUtils.copyProperties(this, dongmanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 国漫先驱类型的值
	*/
	public String getDongmanValue() {
		return dongmanValue;
	}
	/**
	* 设置： 国漫先驱类型的值
	*/
	public void setDongmanValue(String dongmanValue) {
		this.dongmanValue = dongmanValue;
	}
	//当前表的
	/**
	* 获取： 动漫状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 动漫状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}




	@Override
	public String toString() {
		return "DongmanView{" +
			", dongmanValue=" + dongmanValue +
			", zhuangtaiValue=" + zhuangtaiValue +
			"} " + super.toString();
	}
}
