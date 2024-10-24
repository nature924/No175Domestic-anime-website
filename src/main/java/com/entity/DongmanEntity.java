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
 * 国漫先驱
 *
 * @author 
 * @email
 */
@TableName("dongman")
public class DongmanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DongmanEntity() {

	}

	public DongmanEntity(T t) {
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
    @TableField(value = "dongman_name")

    private String dongmanName;


    /**
     * 国漫先驱类型
     */
    @ColumnInfo(comment="国漫先驱类型",type="int(11)")
    @TableField(value = "dongman_types")

    private Integer dongmanTypes;


    /**
     * 封面
     */
    @ColumnInfo(comment="封面",type="varchar(200)")
    @TableField(value = "dongman_photo")

    private String dongmanPhoto;


    /**
     * 介绍视频
     */
    @ColumnInfo(comment="介绍视频",type="varchar(200)")
    @TableField(value = "dongman_video")

    private String dongmanVideo;


    /**
     * 更新时间
     */
    @ColumnInfo(comment="更新时间",type="varchar(200)")
    @TableField(value = "dongman_shijian")

    private String dongmanShijian;


    /**
     * 出品公司
     */
    @ColumnInfo(comment="出品公司",type="varchar(200)")
    @TableField(value = "dongman_faxing")

    private String dongmanFaxing;


    /**
     * 地    区
     */
    @ColumnInfo(comment="地    区",type="varchar(200)")
    @TableField(value = "dongman_add")

    private String dongmanAdd;


    /**
     * 发行公司
     */
    @ColumnInfo(comment="发行公司",type="varchar(200)")
    @TableField(value = "dongman_gs")

    private String dongmanGs;


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
    @TableField(value = "dongman_sc")

    private String dongmanSc;


    /**
     * 集    数
     */
    @ColumnInfo(comment="集    数",type="varchar(200)")
    @TableField(value = "dongman_jishu")

    private String dongmanJishu;


    /**
     * 导    演
     */
    @ColumnInfo(comment="导    演",type="varchar(200)")
    @TableField(value = "dongman_daoyan")

    private String dongmanDaoyan;


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
    @TableField(value = "dongman_content")

    private String dongmanContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "dongman_delete")

    private Integer dongmanDelete;


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
    public String getDongmanName() {
        return dongmanName;
    }
    /**
	 * 设置：动漫名称
	 */

    public void setDongmanName(String dongmanName) {
        this.dongmanName = dongmanName;
    }
    /**
	 * 获取：国漫先驱类型
	 */
    public Integer getDongmanTypes() {
        return dongmanTypes;
    }
    /**
	 * 设置：国漫先驱类型
	 */

    public void setDongmanTypes(Integer dongmanTypes) {
        this.dongmanTypes = dongmanTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getDongmanPhoto() {
        return dongmanPhoto;
    }
    /**
	 * 设置：封面
	 */

    public void setDongmanPhoto(String dongmanPhoto) {
        this.dongmanPhoto = dongmanPhoto;
    }
    /**
	 * 获取：介绍视频
	 */
    public String getDongmanVideo() {
        return dongmanVideo;
    }
    /**
	 * 设置：介绍视频
	 */

    public void setDongmanVideo(String dongmanVideo) {
        this.dongmanVideo = dongmanVideo;
    }
    /**
	 * 获取：更新时间
	 */
    public String getDongmanShijian() {
        return dongmanShijian;
    }
    /**
	 * 设置：更新时间
	 */

    public void setDongmanShijian(String dongmanShijian) {
        this.dongmanShijian = dongmanShijian;
    }
    /**
	 * 获取：出品公司
	 */
    public String getDongmanFaxing() {
        return dongmanFaxing;
    }
    /**
	 * 设置：出品公司
	 */

    public void setDongmanFaxing(String dongmanFaxing) {
        this.dongmanFaxing = dongmanFaxing;
    }
    /**
	 * 获取：地    区
	 */
    public String getDongmanAdd() {
        return dongmanAdd;
    }
    /**
	 * 设置：地    区
	 */

    public void setDongmanAdd(String dongmanAdd) {
        this.dongmanAdd = dongmanAdd;
    }
    /**
	 * 获取：发行公司
	 */
    public String getDongmanGs() {
        return dongmanGs;
    }
    /**
	 * 设置：发行公司
	 */

    public void setDongmanGs(String dongmanGs) {
        this.dongmanGs = dongmanGs;
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
    public String getDongmanSc() {
        return dongmanSc;
    }
    /**
	 * 设置：单集时长
	 */

    public void setDongmanSc(String dongmanSc) {
        this.dongmanSc = dongmanSc;
    }
    /**
	 * 获取：集    数
	 */
    public String getDongmanJishu() {
        return dongmanJishu;
    }
    /**
	 * 设置：集    数
	 */

    public void setDongmanJishu(String dongmanJishu) {
        this.dongmanJishu = dongmanJishu;
    }
    /**
	 * 获取：导    演
	 */
    public String getDongmanDaoyan() {
        return dongmanDaoyan;
    }
    /**
	 * 设置：导    演
	 */

    public void setDongmanDaoyan(String dongmanDaoyan) {
        this.dongmanDaoyan = dongmanDaoyan;
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
    public String getDongmanContent() {
        return dongmanContent;
    }
    /**
	 * 设置：动漫详情
	 */

    public void setDongmanContent(String dongmanContent) {
        this.dongmanContent = dongmanContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDongmanDelete() {
        return dongmanDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setDongmanDelete(Integer dongmanDelete) {
        this.dongmanDelete = dongmanDelete;
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
        return "Dongman{" +
            ", id=" + id +
            ", dongmanName=" + dongmanName +
            ", dongmanTypes=" + dongmanTypes +
            ", dongmanPhoto=" + dongmanPhoto +
            ", dongmanVideo=" + dongmanVideo +
            ", dongmanShijian=" + dongmanShijian +
            ", dongmanFaxing=" + dongmanFaxing +
            ", dongmanAdd=" + dongmanAdd +
            ", dongmanGs=" + dongmanGs +
            ", chuchangTime=" + DateUtil.convertString(chuchangTime,"yyyy-MM-dd") +
            ", dongmanSc=" + dongmanSc +
            ", dongmanJishu=" + dongmanJishu +
            ", dongmanDaoyan=" + dongmanDaoyan +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", dongmanContent=" + dongmanContent +
            ", dongmanDelete=" + dongmanDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
