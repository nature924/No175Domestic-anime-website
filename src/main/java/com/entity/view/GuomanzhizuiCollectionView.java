package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuomanzhizuiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 国漫之最收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guomanzhizui_collection")
public class GuomanzhizuiCollectionView extends GuomanzhizuiCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String guomanzhizuiCollectionValue;

	//级联表 国漫之最
		/**
		* 动漫名称
		*/

		@ColumnInfo(comment="动漫名称",type="varchar(200)")
		private String guomanzhizuiName;
		/**
		* 国漫之最类型
		*/
		@ColumnInfo(comment="国漫之最类型",type="int(11)")
		private Integer guomanzhizuiTypes;
			/**
			* 国漫之最类型的值
			*/
			@ColumnInfo(comment="国漫之最类型的字典表值",type="varchar(200)")
			private String guomanzhizuiValue;
		/**
		* 封面
		*/

		@ColumnInfo(comment="封面",type="varchar(200)")
		private String guomanzhizuiPhoto;
		/**
		* 介绍视频
		*/

		@ColumnInfo(comment="介绍视频",type="varchar(200)")
		private String guomanzhizuiVideo;
		/**
		* 更新时间
		*/

		@ColumnInfo(comment="更新时间",type="varchar(200)")
		private String guomanzhizuiShijian;
		/**
		* 出品公司
		*/

		@ColumnInfo(comment="出品公司",type="varchar(200)")
		private String guomanzhizuiFaxing;
		/**
		* 地    区
		*/

		@ColumnInfo(comment="地    区",type="varchar(200)")
		private String guomanzhizuiAdd;
		/**
		* 发行公司
		*/

		@ColumnInfo(comment="发行公司",type="varchar(200)")
		private String guomanzhizuiGs;
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
		private String guomanzhizuiSc;
		/**
		* 集    数
		*/

		@ColumnInfo(comment="集    数",type="varchar(200)")
		private String guomanzhizuiJishu;
		/**
		* 导    演
		*/

		@ColumnInfo(comment="导    演",type="varchar(200)")
		private String guomanzhizuiDaoyan;
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
		private String guomanzhizuiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer guomanzhizuiDelete;
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



	public GuomanzhizuiCollectionView() {

	}

	public GuomanzhizuiCollectionView(GuomanzhizuiCollectionEntity guomanzhizuiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, guomanzhizuiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getGuomanzhizuiCollectionValue() {
		return guomanzhizuiCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setGuomanzhizuiCollectionValue(String guomanzhizuiCollectionValue) {
		this.guomanzhizuiCollectionValue = guomanzhizuiCollectionValue;
	}


	//级联表的get和set 国漫之最

		/**
		* 获取： 动漫名称
		*/
		public String getGuomanzhizuiName() {
			return guomanzhizuiName;
		}
		/**
		* 设置： 动漫名称
		*/
		public void setGuomanzhizuiName(String guomanzhizuiName) {
			this.guomanzhizuiName = guomanzhizuiName;
		}
		/**
		* 获取： 国漫之最类型
		*/
		public Integer getGuomanzhizuiTypes() {
			return guomanzhizuiTypes;
		}
		/**
		* 设置： 国漫之最类型
		*/
		public void setGuomanzhizuiTypes(Integer guomanzhizuiTypes) {
			this.guomanzhizuiTypes = guomanzhizuiTypes;
		}


			/**
			* 获取： 国漫之最类型的值
			*/
			public String getGuomanzhizuiValue() {
				return guomanzhizuiValue;
			}
			/**
			* 设置： 国漫之最类型的值
			*/
			public void setGuomanzhizuiValue(String guomanzhizuiValue) {
				this.guomanzhizuiValue = guomanzhizuiValue;
			}

		/**
		* 获取： 封面
		*/
		public String getGuomanzhizuiPhoto() {
			return guomanzhizuiPhoto;
		}
		/**
		* 设置： 封面
		*/
		public void setGuomanzhizuiPhoto(String guomanzhizuiPhoto) {
			this.guomanzhizuiPhoto = guomanzhizuiPhoto;
		}

		/**
		* 获取： 介绍视频
		*/
		public String getGuomanzhizuiVideo() {
			return guomanzhizuiVideo;
		}
		/**
		* 设置： 介绍视频
		*/
		public void setGuomanzhizuiVideo(String guomanzhizuiVideo) {
			this.guomanzhizuiVideo = guomanzhizuiVideo;
		}

		/**
		* 获取： 更新时间
		*/
		public String getGuomanzhizuiShijian() {
			return guomanzhizuiShijian;
		}
		/**
		* 设置： 更新时间
		*/
		public void setGuomanzhizuiShijian(String guomanzhizuiShijian) {
			this.guomanzhizuiShijian = guomanzhizuiShijian;
		}

		/**
		* 获取： 出品公司
		*/
		public String getGuomanzhizuiFaxing() {
			return guomanzhizuiFaxing;
		}
		/**
		* 设置： 出品公司
		*/
		public void setGuomanzhizuiFaxing(String guomanzhizuiFaxing) {
			this.guomanzhizuiFaxing = guomanzhizuiFaxing;
		}

		/**
		* 获取： 地    区
		*/
		public String getGuomanzhizuiAdd() {
			return guomanzhizuiAdd;
		}
		/**
		* 设置： 地    区
		*/
		public void setGuomanzhizuiAdd(String guomanzhizuiAdd) {
			this.guomanzhizuiAdd = guomanzhizuiAdd;
		}

		/**
		* 获取： 发行公司
		*/
		public String getGuomanzhizuiGs() {
			return guomanzhizuiGs;
		}
		/**
		* 设置： 发行公司
		*/
		public void setGuomanzhizuiGs(String guomanzhizuiGs) {
			this.guomanzhizuiGs = guomanzhizuiGs;
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
		public String getGuomanzhizuiSc() {
			return guomanzhizuiSc;
		}
		/**
		* 设置： 单集时长
		*/
		public void setGuomanzhizuiSc(String guomanzhizuiSc) {
			this.guomanzhizuiSc = guomanzhizuiSc;
		}

		/**
		* 获取： 集    数
		*/
		public String getGuomanzhizuiJishu() {
			return guomanzhizuiJishu;
		}
		/**
		* 设置： 集    数
		*/
		public void setGuomanzhizuiJishu(String guomanzhizuiJishu) {
			this.guomanzhizuiJishu = guomanzhizuiJishu;
		}

		/**
		* 获取： 导    演
		*/
		public String getGuomanzhizuiDaoyan() {
			return guomanzhizuiDaoyan;
		}
		/**
		* 设置： 导    演
		*/
		public void setGuomanzhizuiDaoyan(String guomanzhizuiDaoyan) {
			this.guomanzhizuiDaoyan = guomanzhizuiDaoyan;
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
		public String getGuomanzhizuiContent() {
			return guomanzhizuiContent;
		}
		/**
		* 设置： 动漫详情
		*/
		public void setGuomanzhizuiContent(String guomanzhizuiContent) {
			this.guomanzhizuiContent = guomanzhizuiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getGuomanzhizuiDelete() {
			return guomanzhizuiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setGuomanzhizuiDelete(Integer guomanzhizuiDelete) {
			this.guomanzhizuiDelete = guomanzhizuiDelete;
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
		return "GuomanzhizuiCollectionView{" +
			", guomanzhizuiCollectionValue=" + guomanzhizuiCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			", guomanzhizuiName=" + guomanzhizuiName +
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
			", guomanzhizuiContent=" + guomanzhizuiContent +
			", guomanzhizuiDelete=" + guomanzhizuiDelete +
			"} " + super.toString();
	}
}
