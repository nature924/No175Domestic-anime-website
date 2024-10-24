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
 * 国漫之最
 *
 * @author 
 * @email
 */
@TableName("guomanzhizui")
public class GuomanzhizuiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuomanzhizuiEntity() {

	}

	public GuomanzhizuiEntity(T t) {
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
     * 动漫名称
     */
    @ColumnInfo(comment="动漫名称",type="varchar(200)")
    @TableField(value = "guomanzhizui_name")

    private String guomanzhizuiName;


    /**
     * 国漫之最类型
     */
    @ColumnInfo(comment="国漫之最类型",type="int(11)")
    @TableField(value = "guomanzhizui_types")

    private Integer guomanzhizuiTypes;


    /**
     * 封面
     */
    @ColumnInfo(comment="封面",type="varchar(200)")
    @TableField(value = "guomanzhizui_photo")

    private String guomanzhizuiPhoto;


    /**
     * 介绍视频
     */
    @ColumnInfo(comment="介绍视频",type="varchar(200)")
    @TableField(value = "guomanzhizui_video")

    private String guomanzhizuiVideo;


    /**
     * 更新时间
     */
    @ColumnInfo(comment="更新时间",type="varchar(200)")
    @TableField(value = "guomanzhizui_shijian")

    private String guomanzhizuiShijian;


    /**
     * 出品公司
     */
    @ColumnInfo(comment="出品公司",type="varchar(200)")
    @TableField(value = "guomanzhizui_faxing")

    private String guomanzhizuiFaxing;


    /**
     * 地    区
     */
    @ColumnInfo(comment="地    区",type="varchar(200)")
    @TableField(value = "guomanzhizui_add")

    private String guomanzhizuiAdd;


    /**
     * 发行公司
     */
    @ColumnInfo(comment="发行公司",type="varchar(200)")
    @TableField(value = "guomanzhizui_gs")

    private String guomanzhizuiGs;


    /**
     * 发行日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="发行日期",type="date")
    @TableField(value = "chuchang_time")

    private Date chuchangTime;


    /**
     * 单集时长
     */
    @ColumnInfo(comment="单集时长",type="varchar(200)")
    @TableField(value = "guomanzhizui_sc")

    private String guomanzhizuiSc;


    /**
     * 集    数
     */
    @ColumnInfo(comment="集    数",type="varchar(200)")
    @TableField(value = "guomanzhizui_jishu")

    private String guomanzhizuiJishu;


    /**
     * 导    演
     */
    @ColumnInfo(comment="导    演",type="varchar(200)")
    @TableField(value = "guomanzhizui_daoyan")

    private String guomanzhizuiDaoyan;


    /**
     * 动漫状态
     */
    @ColumnInfo(comment="动漫状态",type="int(11)")
    @TableField(value = "zhuangtai_types")

    private Integer zhuangtaiTypes;


    /**
     * 动漫详情
     */
    @ColumnInfo(comment="动漫详情",type="text")
    @TableField(value = "guomanzhizui_content")

    private String guomanzhizuiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "guomanzhizui_delete")

    private Integer guomanzhizuiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：动漫名称
	 */
    public String getGuomanzhizuiName() {
        return guomanzhizuiName;
    }
    /**
	 * 设置：动漫名称
	 */

    public void setGuomanzhizuiName(String guomanzhizuiName) {
        this.guomanzhizuiName = guomanzhizuiName;
    }
    /**
	 * 获取：国漫之最类型
	 */
    public Integer getGuomanzhizuiTypes() {
        return guomanzhizuiTypes;
    }
    /**
	 * 设置：国漫之最类型
	 */

    public void setGuomanzhizuiTypes(Integer guomanzhizuiTypes) {
        this.guomanzhizuiTypes = guomanzhizuiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getGuomanzhizuiPhoto() {
        return guomanzhizuiPhoto;
    }
    /**
	 * 设置：封面
	 */

    public void setGuomanzhizuiPhoto(String guomanzhizuiPhoto) {
        this.guomanzhizuiPhoto = guomanzhizuiPhoto;
    }
    /**
	 * 获取：介绍视频
	 */
    public String getGuomanzhizuiVideo() {
        return guomanzhizuiVideo;
    }
    /**
	 * 设置：介绍视频
	 */

    public void setGuomanzhizuiVideo(String guomanzhizuiVideo) {
        this.guomanzhizuiVideo = guomanzhizuiVideo;
    }
    /**
	 * 获取：更新时间
	 */
    public String getGuomanzhizuiShijian() {
        return guomanzhizuiShijian;
    }
    /**
	 * 设置：更新时间
	 */

    public void setGuomanzhizuiShijian(String guomanzhizuiShijian) {
        this.guomanzhizuiShijian = guomanzhizuiShijian;
    }
    /**
	 * 获取：出品公司
	 */
    public String getGuomanzhizuiFaxing() {
        return guomanzhizuiFaxing;
    }
    /**
	 * 设置：出品公司
	 */

    public void setGuomanzhizuiFaxing(String guomanzhizuiFaxing) {
        this.guomanzhizuiFaxing = guomanzhizuiFaxing;
    }
    /**
	 * 获取：地    区
	 */
    public String getGuomanzhizuiAdd() {
        return guomanzhizuiAdd;
    }
    /**
	 * 设置：地    区
	 */

    public void setGuomanzhizuiAdd(String guomanzhizuiAdd) {
        this.guomanzhizuiAdd = guomanzhizuiAdd;
    }
    /**
	 * 获取：发行公司
	 */
    public String getGuomanzhizuiGs() {
        return guomanzhizuiGs;
    }
    /**
	 * 设置：发行公司
	 */

    public void setGuomanzhizuiGs(String guomanzhizuiGs) {
        this.guomanzhizuiGs = guomanzhizuiGs;
    }
    /**
	 * 获取：发行日期
	 */
    public Date getChuchangTime() {
        return chuchangTime;
    }
    /**
	 * 设置：发行日期
	 */

    public void setChuchangTime(Date chuchangTime) {
        this.chuchangTime = chuchangTime;
    }
    /**
	 * 获取：单集时长
	 */
    public String getGuomanzhizuiSc() {
        return guomanzhizuiSc;
    }
    /**
	 * 设置：单集时长
	 */

    public void setGuomanzhizuiSc(String guomanzhizuiSc) {
        this.guomanzhizuiSc = guomanzhizuiSc;
    }
    /**
	 * 获取：集    数
	 */
    public String getGuomanzhizuiJishu() {
        return guomanzhizuiJishu;
    }
    /**
	 * 设置：集    数
	 */

    public void setGuomanzhizuiJishu(String guomanzhizuiJishu) {
        this.guomanzhizuiJishu = guomanzhizuiJishu;
    }
    /**
	 * 获取：导    演
	 */
    public String getGuomanzhizuiDaoyan() {
        return guomanzhizuiDaoyan;
    }
    /**
	 * 设置：导    演
	 */

    public void setGuomanzhizuiDaoyan(String guomanzhizuiDaoyan) {
        this.guomanzhizuiDaoyan = guomanzhizuiDaoyan;
    }
    /**
	 * 获取：动漫状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }
    /**
	 * 设置：动漫状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：动漫详情
	 */
    public String getGuomanzhizuiContent() {
        return guomanzhizuiContent;
    }
    /**
	 * 设置：动漫详情
	 */

    public void setGuomanzhizuiContent(String guomanzhizuiContent) {
        this.guomanzhizuiContent = guomanzhizuiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGuomanzhizuiDelete() {
        return guomanzhizuiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setGuomanzhizuiDelete(Integer guomanzhizuiDelete) {
        this.guomanzhizuiDelete = guomanzhizuiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Guomanzhizui{" +
            ", id=" + id +
            ", guomanzhizuiName=" + guomanzhizuiName +
            ", guomanzhizuiTypes=" + guomanzhizuiTypes +
            ", guomanzhizuiPhoto=" + guomanzhizuiPhoto +
            ", guomanzhizuiVideo=" + guomanzhizuiVideo +
            ", guomanzhizuiShijian=" + guomanzhizuiShijian +
            ", guomanzhizuiFaxing=" + guomanzhizuiFaxing +
            ", guomanzhizuiAdd=" + guomanzhizuiAdd +
            ", guomanzhizuiGs=" + guomanzhizuiGs +
            ", chuchangTime=" + DateUtil.convertString(chuchangTime,"yyyy-MM-dd") +
            ", guomanzhizuiSc=" + guomanzhizuiSc +
            ", guomanzhizuiJishu=" + guomanzhizuiJishu +
            ", guomanzhizuiDaoyan=" + guomanzhizuiDaoyan +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", guomanzhizuiContent=" + guomanzhizuiContent +
            ", guomanzhizuiDelete=" + guomanzhizuiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
