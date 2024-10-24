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
 * 历史沿革
 *
 * @author 
 * @email
 */
@TableName("lishiyange")
public class LishiyangeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LishiyangeEntity() {

	}

	public LishiyangeEntity(T t) {
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
     * 标题
     */
    @ColumnInfo(comment="标题",type="varchar(200)")
    @TableField(value = "lishiyange_name")

    private String lishiyangeName;


    /**
     * 内容类型
     */
    @ColumnInfo(comment="内容类型",type="int(11)")
    @TableField(value = "lishiyange_types")

    private Integer lishiyangeTypes;


    /**
     * 图片
     */
    @ColumnInfo(comment="图片",type="varchar(200)")
    @TableField(value = "lishiyange_photo")

    private String lishiyangePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情
     */
    @ColumnInfo(comment="详情",type="text")
    @TableField(value = "lishiyange_content")

    private String lishiyangeContent;


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
	 * 获取：标题
	 */
    public String getLishiyangeName() {
        return lishiyangeName;
    }
    /**
	 * 设置：标题
	 */

    public void setLishiyangeName(String lishiyangeName) {
        this.lishiyangeName = lishiyangeName;
    }
    /**
	 * 获取：内容类型
	 */
    public Integer getLishiyangeTypes() {
        return lishiyangeTypes;
    }
    /**
	 * 设置：内容类型
	 */

    public void setLishiyangeTypes(Integer lishiyangeTypes) {
        this.lishiyangeTypes = lishiyangeTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getLishiyangePhoto() {
        return lishiyangePhoto;
    }
    /**
	 * 设置：图片
	 */

    public void setLishiyangePhoto(String lishiyangePhoto) {
        this.lishiyangePhoto = lishiyangePhoto;
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
	 * 获取：详情
	 */
    public String getLishiyangeContent() {
        return lishiyangeContent;
    }
    /**
	 * 设置：详情
	 */

    public void setLishiyangeContent(String lishiyangeContent) {
        this.lishiyangeContent = lishiyangeContent;
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
        return "Lishiyange{" +
            ", id=" + id +
            ", lishiyangeName=" + lishiyangeName +
            ", lishiyangeTypes=" + lishiyangeTypes +
            ", lishiyangePhoto=" + lishiyangePhoto +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", lishiyangeContent=" + lishiyangeContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
