package com.entity.vo;

import com.entity.LishiyangeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 历史沿革
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lishiyange")
public class LishiyangeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "lishiyange_name")
    private String lishiyangeName;


    /**
     * 内容类型
     */

    @TableField(value = "lishiyange_types")
    private Integer lishiyangeTypes;


    /**
     * 图片
     */

    @TableField(value = "lishiyange_photo")
    private String lishiyangePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情
     */

    @TableField(value = "lishiyange_content")
    private String lishiyangeContent;


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
	 * 设置：标题
	 */
    public String getLishiyangeName() {
        return lishiyangeName;
    }


    /**
	 * 获取：标题
	 */

    public void setLishiyangeName(String lishiyangeName) {
        this.lishiyangeName = lishiyangeName;
    }
    /**
	 * 设置：内容类型
	 */
    public Integer getLishiyangeTypes() {
        return lishiyangeTypes;
    }


    /**
	 * 获取：内容类型
	 */

    public void setLishiyangeTypes(Integer lishiyangeTypes) {
        this.lishiyangeTypes = lishiyangeTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getLishiyangePhoto() {
        return lishiyangePhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setLishiyangePhoto(String lishiyangePhoto) {
        this.lishiyangePhoto = lishiyangePhoto;
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
	 * 设置：详情
	 */
    public String getLishiyangeContent() {
        return lishiyangeContent;
    }


    /**
	 * 获取：详情
	 */

    public void setLishiyangeContent(String lishiyangeContent) {
        this.lishiyangeContent = lishiyangeContent;
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
