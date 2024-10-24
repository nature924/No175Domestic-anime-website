package com.entity.vo;

import com.entity.ZhishuchangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 知识窗
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhishuchang")
public class ZhishuchangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 知识标题
     */

    @TableField(value = "zhishuchang_name")
    private String zhishuchangName;


    /**
     * 知识类型
     */

    @TableField(value = "zhishuchang_types")
    private Integer zhishuchangTypes;


    /**
     * 知识图片
     */

    @TableField(value = "zhishuchang_photo")
    private String zhishuchangPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 知识详情
     */

    @TableField(value = "zhishuchang_content")
    private String zhishuchangContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：知识标题
	 */
    public String getZhishuchangName() {
        return zhishuchangName;
    }


    /**
	 * 获取：知识标题
	 */

    public void setZhishuchangName(String zhishuchangName) {
        this.zhishuchangName = zhishuchangName;
    }
    /**
	 * 设置：知识类型
	 */
    public Integer getZhishuchangTypes() {
        return zhishuchangTypes;
    }


    /**
	 * 获取：知识类型
	 */

    public void setZhishuchangTypes(Integer zhishuchangTypes) {
        this.zhishuchangTypes = zhishuchangTypes;
    }
    /**
	 * 设置：知识图片
	 */
    public String getZhishuchangPhoto() {
        return zhishuchangPhoto;
    }


    /**
	 * 获取：知识图片
	 */

    public void setZhishuchangPhoto(String zhishuchangPhoto) {
        this.zhishuchangPhoto = zhishuchangPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：知识详情
	 */
    public String getZhishuchangContent() {
        return zhishuchangContent;
    }


    /**
	 * 获取：知识详情
	 */

    public void setZhishuchangContent(String zhishuchangContent) {
        this.zhishuchangContent = zhishuchangContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
