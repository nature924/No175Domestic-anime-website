package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DongmanCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 国漫先驱收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dongman_collection")
public class DongmanCollectionView extends DongmanCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String dongmanCollectionValue;

	//级联表 国漫先驱
		/**
		* 动漫名称
		*/

		@ColumnInfo(comment="动漫名称",type="varchar(200)")
		private String dongmanName;
		/**
		* 国漫先驱类型
		*/
		@ColumnInfo(comment="国漫先驱类型",type="int(11)")
		private Integer dongmanTypes;
			/**
			* 国漫先驱类型的值
			*/
			@ColumnInfo(comment="国漫先驱类型的字典表值",type="varchar(200)")
			private String dongmanValue;
		/**
		* 封面
		*/

		@ColumnInfo(comment="封面",type="varchar(200)")
		private String dongmanPhoto;
		/**
		* 介绍视频
		*/

		@ColumnInfo(comment="介绍视频",type="varchar(200)")
		private String dongmanVideo;
		/**
		* 更新时间
		*/

		@ColumnInfo(comment="更新时间",type="varchar(200)")
		private String dongmanShijian;
		/**
		* 出品公司
		*/

		@ColumnInfo(comment="出品公司",type="varchar(200)")
		private String dongmanFaxing;
		/**
		* 地    区
		*/

		@ColumnInfo(comment="地    区",type="varchar(200)")
		private String dongmanAdd;
		/**
		* 发行公司
		*/

		@ColumnInfo(comment="发行公司",type="varchar(200)")
		private String dongmanGs;
		/**
		* 发行日期
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="发行日期",type="date")
		private Date chuchangTime;
		/**
		* 单集时长
		*/

		@ColumnInfo(comment="单集时长",type="varchar(200)")
		private String dongmanSc;
		/**
		* 集    数
		*/

		@ColumnInfo(comment="集    数",type="varchar(200)")
		private String dongmanJishu;
		/**
		* 导    演
		*/

		@ColumnInfo(comment="导    演",type="varchar(200)")
		private String dongmanDaoyan;
		/**
		* 动漫状态
		*/
		@ColumnInfo(comment="动漫状态",type="int(11)")
		private Integer zhuangtaiTypes;
			/**
			* 动漫状态的值
			*/
			@ColumnInfo(comment="动漫状态的字典表值",type="varchar(200)")
			private String zhuangtaiValue;
		/**
		* 动漫详情
		*/

		@ColumnInfo(comment="动漫详情",type="text")
		private String dongmanContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer dongmanDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;



	public DongmanCollectionView() {

	}

	public DongmanCollectionView(DongmanCollectionEntity dongmanCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, dongmanCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getDongmanCollectionValue() {
		return dongmanCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setDongmanCollectionValue(String dongmanCollectionValue) {
		this.dongmanCollectionValue = dongmanCollectionValue;
	}


	//级联表的get和set 国漫先驱

		/**
		* 获取： 动漫名称
		*/
		public String getDongmanName() {
			return dongmanName;
		}
		/**
		* 设置： 动漫名称
		*/
		public void setDongmanName(String dongmanName) {
			this.dongmanName = dongmanName;
		}
		/**
		* 获取： 国漫先驱类型
		*/
		public Integer getDongmanTypes() {
			return dongmanTypes;
		}
		/**
		* 设置： 国漫先驱类型
		*/
		public void setDongmanTypes(Integer dongmanTypes) {
			this.dongmanTypes = dongmanTypes;
		}


			/**
			* 获取： 国漫先驱类型的值
			*/
			public String getDongmanValue() {
				return dongmanValue;
			}
			/**
			* 设置： 国漫先驱类型的值
			*/
			public void setDongmanValue(String dongmanValue) {
				this.dongmanValue = dongmanValue;
			}

		/**
		* 获取： 封面
		*/
		public String getDongmanPhoto() {
			return dongmanPhoto;
		}
		/**
		* 设置： 封面
		*/
		public void setDongmanPhoto(String dongmanPhoto) {
			this.dongmanPhoto = dongmanPhoto;
		}

		/**
		* 获取： 介绍视频
		*/
		public String getDongmanVideo() {
			return dongmanVideo;
		}
		/**
		* 设置： 介绍视频
		*/
		public void setDongmanVideo(String dongmanVideo) {
			this.dongmanVideo = dongmanVideo;
		}

		/**
		* 获取： 更新时间
		*/
		public String getDongmanShijian() {
			return dongmanShijian;
		}
		/**
		* 设置： 更新时间
		*/
		public void setDongmanShijian(String dongmanShijian) {
			this.dongmanShijian = dongmanShijian;
		}

		/**
		* 获取： 出品公司
		*/
		public String getDongmanFaxing() {
			return dongmanFaxing;
		}
		/**
		* 设置： 出品公司
		*/
		public void setDongmanFaxing(String dongmanFaxing) {
			this.dongmanFaxing = dongmanFaxing;
		}

		/**
		* 获取： 地    区
		*/
		public String getDongmanAdd() {
			return dongmanAdd;
		}
		/**
		* 设置： 地    区
		*/
		public void setDongmanAdd(String dongmanAdd) {
			this.dongmanAdd = dongmanAdd;
		}

		/**
		* 获取： 发行公司
		*/
		public String getDongmanGs() {
			return dongmanGs;
		}
		/**
		* 设置： 发行公司
		*/
		public void setDongmanGs(String dongmanGs) {
			this.dongmanGs = dongmanGs;
		}

		/**
		* 获取： 发行日期
		*/
		public Date getChuchangTime() {
			return chuchangTime;
		}
		/**
		* 设置： 发行日期
		*/
		public void setChuchangTime(Date chuchangTime) {
			this.chuchangTime = chuchangTime;
		}

		/**
		* 获取： 单集时长
		*/
		public String getDongmanSc() {
			return dongmanSc;
		}
		/**
		* 设置： 单集时长
		*/
		public void setDongmanSc(String dongmanSc) {
			this.dongmanSc = dongmanSc;
		}

		/**
		* 获取： 集    数
		*/
		public String getDongmanJishu() {
			return dongmanJishu;
		}
		/**
		* 设置： 集    数
		*/
		public void setDongmanJishu(String dongmanJishu) {
			this.dongmanJishu = dongmanJishu;
		}

		/**
		* 获取： 导    演
		*/
		public String getDongmanDaoyan() {
			return dongmanDaoyan;
		}
		/**
		* 设置： 导    演
		*/
		public void setDongmanDaoyan(String dongmanDaoyan) {
			this.dongmanDaoyan = dongmanDaoyan;
		}
		/**
		* 获取： 动漫状态
		*/
		public Integer getZhuangtaiTypes() {
			return zhuangtaiTypes;
		}
		/**
		* 设置： 动漫状态
		*/
		public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
			this.zhuangtaiTypes = zhuangtaiTypes;
		}


			/**
			* 获取： 动漫状态的值
			*/
			public String getZhuangtaiValue() {
				return zhuangtaiValue;
			}
			/**
			* 设置： 动漫状态的值
			*/
			public void setZhuangtaiValue(String zhuangtaiValue) {
				this.zhuangtaiValue = zhuangtaiValue;
			}

		/**
		* 获取： 动漫详情
		*/
		public String getDongmanContent() {
			return dongmanContent;
		}
		/**
		* 设置： 动漫详情
		*/
		public void setDongmanContent(String dongmanContent) {
			this.dongmanContent = dongmanContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getDongmanDelete() {
			return dongmanDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setDongmanDelete(Integer dongmanDelete) {
			this.dongmanDelete = dongmanDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "DongmanCollectionView{" +
			", dongmanCollectionValue=" + dongmanCollectionValue +
			", dongmanName=" + dongmanName +
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
			", dongmanContent=" + dongmanContent +
			", dongmanDelete=" + dongmanDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
