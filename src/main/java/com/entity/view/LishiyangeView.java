package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LishiyangeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 历史沿革
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("lishiyange")
public class LishiyangeView extends LishiyangeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 内容类型的值
	*/
	@ColumnInfo(comment="内容类型的字典表值",type="varchar(200)")
	private String lishiyangeValue;




	public LishiyangeView() {

	}

	public LishiyangeView(LishiyangeEntity lishiyangeEntity) {
		try {
			BeanUtils.copyProperties(this, lishiyangeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 内容类型的值
	*/
	public String getLishiyangeValue() {
		return lishiyangeValue;
	}
	/**
	* 设置： 内容类型的值
	*/
	public void setLishiyangeValue(String lishiyangeValue) {
		this.lishiyangeValue = lishiyangeValue;
	}




	@Override
	public String toString() {
		return "LishiyangeView{" +
			", lishiyangeValue=" + lishiyangeValue +
			"} " + super.toString();
	}
}
