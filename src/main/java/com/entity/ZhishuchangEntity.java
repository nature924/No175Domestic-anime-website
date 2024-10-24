package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 知识窗
 *
 * @author 
 * @email
 */
@TableName("zhishuchang")
public class ZhishuchangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhishuchangEntity() {

	}

	public ZhishuchangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 知识标题
     */
    @ColumnInfo(comment="知识标题",type="varchar(200)")
    @TableField(value = "zhishuchang_name")

    private String zhishuchangName;


    /**
     * 知识类型
     */
    @ColumnInfo(comment="知识类型",type="int(11)")
    @TableField(value = "zhishuchang_types")

    private Integer zhishuchangTypes;


    /**
     * 知识图片
     */
    @ColumnInfo(comment="知识图片",type="varchar(200)")
    @TableField(value = "zhishuchang_photo")

    private String zhishuchangPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 知识详情
     */
    @ColumnInfo(comment="知识详情",type="text")
    @TableField(value = "zhishuchang_content")

    private String zhishuchangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：知识标题
	 */
    public String getZhishuchangName() {
        return zhishuchangName;
    }
    /**
	 * 设置：知识标题
	 */

    public void setZhishuchangName(String zhishuchangName) {
        this.zhishuchangName = zhishuchangName;
    }
    /**
	 * 获取：知识类型
	 */
    public Integer getZhishuchangTypes() {
        return zhishuchangTypes;
    }
    /**
	 * 设置：知识类型
	 */

    public void setZhishuchangTypes(Integer zhishuchangTypes) {
        this.zhishuchangTypes = zhishuchangTypes;
    }
    /**
	 * 获取：知识图片
	 */
    public String getZhishuchangPhoto() {
        return zhishuchangPhoto;
    }
    /**
	 * 设置：知识图片
	 */

    public void setZhishuchangPhoto(String zhishuchangPhoto) {
        this.zhishuchangPhoto = zhishuchangPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：知识详情
	 */
    public String getZhishuchangContent() {
        return zhishuchangContent;
    }
    /**
	 * 设置：知识详情
	 */

    public void setZhishuchangContent(String zhishuchangContent) {
        this.zhishuchangContent = zhishuchangContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zhishuchang{" +
            ", id=" + id +
            ", zhishuchangName=" + zhishuchangName +
            ", zhishuchangTypes=" + zhishuchangTypes +
            ", zhishuchangPhoto=" + zhishuchangPhoto +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", zhishuchangContent=" + zhishuchangContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
