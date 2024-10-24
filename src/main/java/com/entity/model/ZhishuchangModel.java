package com.entity.model;

import com.entity.ZhishuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 知识窗
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhishuchangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 知识标题
     */
    private String zhishuchangName;


    /**
     * 知识类型
     */
    private Integer zhishuchangTypes;


    /**
     * 知识图片
     */
    private String zhishuchangPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 知识详情
     */
    private String zhishuchangContent;


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
