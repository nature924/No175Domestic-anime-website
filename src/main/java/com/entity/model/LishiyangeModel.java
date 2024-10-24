package com.entity.model;

import com.entity.LishiyangeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 历史沿革
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LishiyangeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String lishiyangeName;


    /**
     * 内容类型
     */
    private Integer lishiyangeTypes;


    /**
     * 图片
     */
    private String lishiyangePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情
     */
    private String lishiyangeContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
