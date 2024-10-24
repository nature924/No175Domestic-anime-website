package com.entity.vo;

import com.entity.GuomanzhizuiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 国漫之最
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guomanzhizui")
public class GuomanzhizuiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动漫名称
     */

    @TableField(value = "guomanzhizui_name")
    private String guomanzhizuiName;


    /**
     * 国漫之最类型
     */

    @TableField(value = "guomanzhizui_types")
    private Integer guomanzhizuiTypes;


    /**
     * 封面
     */

    @TableField(value = "guomanzhizui_photo")
    private String guomanzhizuiPhoto;


    /**
     * 介绍视频
     */

    @TableField(value = "guomanzhizui_video")
    private String guomanzhizuiVideo;


    /**
     * 更新时间
     */

    @TableField(value = "guomanzhizui_shijian")
    private String guomanzhizuiShijian;


    /**
     * 出品公司
     */

    @TableField(value = "guomanzhizui_faxing")
    private String guomanzhizuiFaxing;


    /**
     * 地    区
     */

    @TableField(value = "guomanzhizui_add")
    private String guomanzhizuiAdd;


    /**
     * 发行公司
     */

    @TableField(value = "guomanzhizui_gs")
    private String guomanzhizuiGs;


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

    @TableField(value = "guomanzhizui_sc")
    private String guomanzhizuiSc;


    /**
     * 集    数
     */

    @TableField(value = "guomanzhizui_jishu")
    private String guomanzhizuiJishu;


    /**
     * 导    演
     */

    @TableField(value = "guomanzhizui_daoyan")
    private String guomanzhizuiDaoyan;


    /**
     * 动漫状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 动漫详情
     */

    @TableField(value = "guomanzhizui_content")
    private String guomanzhizuiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "guomanzhizui_delete")
    private Integer guomanzhizuiDelete;


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
    public String getGuomanzhizuiName() {
        return guomanzhizuiName;
    }


    /**
	 * 获取：动漫名称
	 */

    public void setGuomanzhizuiName(String guomanzhizuiName) {
        this.guomanzhizuiName = guomanzhizuiName;
    }
    /**
	 * 设置：国漫之最类型
	 */
    public Integer getGuomanzhizuiTypes() {
        return guomanzhizuiTypes;
    }


    /**
	 * 获取：国漫之最类型
	 */

    public void setGuomanzhizuiTypes(Integer guomanzhizuiTypes) {
        this.guomanzhizuiTypes = guomanzhizuiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getGuomanzhizuiPhoto() {
        return guomanzhizuiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setGuomanzhizuiPhoto(String guomanzhizuiPhoto) {
        this.guomanzhizuiPhoto = guomanzhizuiPhoto;
    }
    /**
	 * 设置：介绍视频
	 */
    public String getGuomanzhizuiVideo() {
        return guomanzhizuiVideo;
    }


    /**
	 * 获取：介绍视频
	 */

    public void setGuomanzhizuiVideo(String guomanzhizuiVideo) {
        this.guomanzhizuiVideo = guomanzhizuiVideo;
    }
    /**
	 * 设置：更新时间
	 */
    public String getGuomanzhizuiShijian() {
        return guomanzhizuiShijian;
    }


    /**
	 * 获取：更新时间
	 */

    public void setGuomanzhizuiShijian(String guomanzhizuiShijian) {
        this.guomanzhizuiShijian = guomanzhizuiShijian;
    }
    /**
	 * 设置：出品公司
	 */
    public String getGuomanzhizuiFaxing() {
        return guomanzhizuiFaxing;
    }


    /**
	 * 获取：出品公司
	 */

    public void setGuomanzhizuiFaxing(String guomanzhizuiFaxing) {
        this.guomanzhizuiFaxing = guomanzhizuiFaxing;
    }
    /**
	 * 设置：地    区
	 */
    public String getGuomanzhizuiAdd() {
        return guomanzhizuiAdd;
    }


    /**
	 * 获取：地    区
	 */

    public void setGuomanzhizuiAdd(String guomanzhizuiAdd) {
        this.guomanzhizuiAdd = guomanzhizuiAdd;
    }
    /**
	 * 设置：发行公司
	 */
    public String getGuomanzhizuiGs() {
        return guomanzhizuiGs;
    }


    /**
	 * 获取：发行公司
	 */

    public void setGuomanzhizuiGs(String guomanzhizuiGs) {
        this.guomanzhizuiGs = guomanzhizuiGs;
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
    public String getGuomanzhizuiSc() {
        return guomanzhizuiSc;
    }


    /**
	 * 获取：单集时长
	 */

    public void setGuomanzhizuiSc(String guomanzhizuiSc) {
        this.guomanzhizuiSc = guomanzhizuiSc;
    }
    /**
	 * 设置：集    数
	 */
    public String getGuomanzhizuiJishu() {
        return guomanzhizuiJishu;
    }


    /**
	 * 获取：集    数
	 */

    public void setGuomanzhizuiJishu(String guomanzhizuiJishu) {
        this.guomanzhizuiJishu = guomanzhizuiJishu;
    }
    /**
	 * 设置：导    演
	 */
    public String getGuomanzhizuiDaoyan() {
        return guomanzhizuiDaoyan;
    }


    /**
	 * 获取：导    演
	 */

    public void setGuomanzhizuiDaoyan(String guomanzhizuiDaoyan) {
        this.guomanzhizuiDaoyan = guomanzhizuiDaoyan;
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
    public String getGuomanzhizuiContent() {
        return guomanzhizuiContent;
    }


    /**
	 * 获取：动漫详情
	 */

    public void setGuomanzhizuiContent(String guomanzhizuiContent) {
        this.guomanzhizuiContent = guomanzhizuiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGuomanzhizuiDelete() {
        return guomanzhizuiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGuomanzhizuiDelete(Integer guomanzhizuiDelete) {
        this.guomanzhizuiDelete = guomanzhizuiDelete;
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
