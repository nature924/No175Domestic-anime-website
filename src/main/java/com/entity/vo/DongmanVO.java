package com.entity.vo;

import com.entity.DongmanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 国漫先驱
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dongman")
public class DongmanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动漫名称
     */

    @TableField(value = "dongman_name")
    private String dongmanName;


    /**
     * 国漫先驱类型
     */

    @TableField(value = "dongman_types")
    private Integer dongmanTypes;


    /**
     * 封面
     */

    @TableField(value = "dongman_photo")
    private String dongmanPhoto;


    /**
     * 介绍视频
     */

    @TableField(value = "dongman_video")
    private String dongmanVideo;


    /**
     * 更新时间
     */

    @TableField(value = "dongman_shijian")
    private String dongmanShijian;


    /**
     * 出品公司
     */

    @TableField(value = "dongman_faxing")
    private String dongmanFaxing;


    /**
     * 地    区
     */

    @TableField(value = "dongman_add")
    private String dongmanAdd;


    /**
     * 发行公司
     */

    @TableField(value = "dongman_gs")
    private String dongmanGs;


    /**
     * 发行日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chuchang_time")
    private Date chuchangTime;


    /**
     * 单集时长
     */

    @TableField(value = "dongman_sc")
    private String dongmanSc;


    /**
     * 集    数
     */

    @TableField(value = "dongman_jishu")
    private String dongmanJishu;


    /**
     * 导    演
     */

    @TableField(value = "dongman_daoyan")
    private String dongmanDaoyan;


    /**
     * 动漫状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 动漫详情
     */

    @TableField(value = "dongman_content")
    private String dongmanContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "dongman_delete")
    private Integer dongmanDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：动漫名称
	 */
    public String getDongmanName() {
        return dongmanName;
    }


    /**
	 * 获取：动漫名称
	 */

    public void setDongmanName(String dongmanName) {
        this.dongmanName = dongmanName;
    }
    /**
	 * 设置：国漫先驱类型
	 */
    public Integer getDongmanTypes() {
        return dongmanTypes;
    }


    /**
	 * 获取：国漫先驱类型
	 */

    public void setDongmanTypes(Integer dongmanTypes) {
        this.dongmanTypes = dongmanTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getDongmanPhoto() {
        return dongmanPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setDongmanPhoto(String dongmanPhoto) {
        this.dongmanPhoto = dongmanPhoto;
    }
    /**
	 * 设置：介绍视频
	 */
    public String getDongmanVideo() {
        return dongmanVideo;
    }


    /**
	 * 获取：介绍视频
	 */

    public void setDongmanVideo(String dongmanVideo) {
        this.dongmanVideo = dongmanVideo;
    }
    /**
	 * 设置：更新时间
	 */
    public String getDongmanShijian() {
        return dongmanShijian;
    }


    /**
	 * 获取：更新时间
	 */

    public void setDongmanShijian(String dongmanShijian) {
        this.dongmanShijian = dongmanShijian;
    }
    /**
	 * 设置：出品公司
	 */
    public String getDongmanFaxing() {
        return dongmanFaxing;
    }


    /**
	 * 获取：出品公司
	 */

    public void setDongmanFaxing(String dongmanFaxing) {
        this.dongmanFaxing = dongmanFaxing;
    }
    /**
	 * 设置：地    区
	 */
    public String getDongmanAdd() {
        return dongmanAdd;
    }


    /**
	 * 获取：地    区
	 */

    public void setDongmanAdd(String dongmanAdd) {
        this.dongmanAdd = dongmanAdd;
    }
    /**
	 * 设置：发行公司
	 */
    public String getDongmanGs() {
        return dongmanGs;
    }


    /**
	 * 获取：发行公司
	 */

    public void setDongmanGs(String dongmanGs) {
        this.dongmanGs = dongmanGs;
    }
    /**
	 * 设置：发行日期
	 */
    public Date getChuchangTime() {
        return chuchangTime;
    }


    /**
	 * 获取：发行日期
	 */

    public void setChuchangTime(Date chuchangTime) {
        this.chuchangTime = chuchangTime;
    }
    /**
	 * 设置：单集时长
	 */
    public String getDongmanSc() {
        return dongmanSc;
    }


    /**
	 * 获取：单集时长
	 */

    public void setDongmanSc(String dongmanSc) {
        this.dongmanSc = dongmanSc;
    }
    /**
	 * 设置：集    数
	 */
    public String getDongmanJishu() {
        return dongmanJishu;
    }


    /**
	 * 获取：集    数
	 */

    public void setDongmanJishu(String dongmanJishu) {
        this.dongmanJishu = dongmanJishu;
    }
    /**
	 * 设置：导    演
	 */
    public String getDongmanDaoyan() {
        return dongmanDaoyan;
    }


    /**
	 * 获取：导    演
	 */

    public void setDongmanDaoyan(String dongmanDaoyan) {
        this.dongmanDaoyan = dongmanDaoyan;
    }
    /**
	 * 设置：动漫状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：动漫状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：动漫详情
	 */
    public String getDongmanContent() {
        return dongmanContent;
    }


    /**
	 * 获取：动漫详情
	 */

    public void setDongmanContent(String dongmanContent) {
        this.dongmanContent = dongmanContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDongmanDelete() {
        return dongmanDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDongmanDelete(Integer dongmanDelete) {
        this.dongmanDelete = dongmanDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
