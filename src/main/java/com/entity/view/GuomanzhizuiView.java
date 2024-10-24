package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuomanzhizuiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 国漫之最
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guomanzhizui")
public class GuomanzhizuiView extends GuomanzhizuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 国漫之最类型的值
	*/
	@ColumnInfo(comment="国漫之最类型的字典表值",type="varchar(200)")
	private String guomanzhizuiValue;
	/**
	* 动漫状态的值
	*/
	@ColumnInfo(comment="动漫状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;




	public GuomanzhizuiView() {

	}

	public GuomanzhizuiView(GuomanzhizuiEntity guomanzhizuiEntity) {
		try {
			BeanUtils.copyProperties(this, guomanzhizuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 国漫之最类型的值
	*/
	public String getGuomanzhizuiValue() {
		return guomanzhizuiValue;
	}
	/**
	* 设置： 国漫之最类型的值
	*/
	public void setGuomanzhizuiValue(String guomanzhizuiValue) {
		this.guomanzhizuiValue = guomanzhizuiValue;
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
		return "GuomanzhizuiView{" +
			", guomanzhizuiValue=" + guomanzhizuiValue +
			", zhuangtaiValue=" + zhuangtaiValue +
			"} " + super.toString();
	}
}
