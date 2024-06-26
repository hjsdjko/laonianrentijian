package com.entity.view;

import com.entity.TijiantixingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 体检提醒
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tijiantixing")
public class TijiantixingView extends TijiantixingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 体检状态的值
		*/
		private String tijiantixingValue;



		//级联表 tijianxiangmu
			/**
			* 标题
			*/
			private String tijianxiangmuName;
			/**
			* 体检项目类型
			*/
			private Integer tijianxiangmuTypes;
				/**
				* 体检项目类型的值
				*/
				private String tijianxiangmuValue;
			/**
			* 项目封面
			*/
			private String tijianxiangmuPhoto;
			/**
			* 体检项目详情
			*/
			private String tijianxiangmuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 住址
			*/
			private String yonghuAddress;
			/**
			* 出生日期
			*/
			private String yonghuChushengriqi;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public TijiantixingView() {

	}

	public TijiantixingView(TijiantixingEntity tijiantixingEntity) {
		try {
			BeanUtils.copyProperties(this, tijiantixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 体检状态的值
			*/
			public String getTijiantixingValue() {
				return tijiantixingValue;
			}
			/**
			* 设置： 体检状态的值
			*/
			public void setTijiantixingValue(String tijiantixingValue) {
				this.tijiantixingValue = tijiantixingValue;
			}


























				//级联表的get和set tijianxiangmu
					/**
					* 获取： 标题
					*/
					public String getTijianxiangmuName() {
						return tijianxiangmuName;
					}
					/**
					* 设置： 标题
					*/
					public void setTijianxiangmuName(String tijianxiangmuName) {
						this.tijianxiangmuName = tijianxiangmuName;
					}
					/**
					* 获取： 体检项目类型
					*/
					public Integer getTijianxiangmuTypes() {
						return tijianxiangmuTypes;
					}
					/**
					* 设置： 体检项目类型
					*/
					public void setTijianxiangmuTypes(Integer tijianxiangmuTypes) {
						this.tijianxiangmuTypes = tijianxiangmuTypes;
					}


						/**
						* 获取： 体检项目类型的值
						*/
						public String getTijianxiangmuValue() {
							return tijianxiangmuValue;
						}
						/**
						* 设置： 体检项目类型的值
						*/
						public void setTijianxiangmuValue(String tijianxiangmuValue) {
							this.tijianxiangmuValue = tijianxiangmuValue;
						}
					/**
					* 获取： 项目封面
					*/
					public String getTijianxiangmuPhoto() {
						return tijianxiangmuPhoto;
					}
					/**
					* 设置： 项目封面
					*/
					public void setTijianxiangmuPhoto(String tijianxiangmuPhoto) {
						this.tijianxiangmuPhoto = tijianxiangmuPhoto;
					}
					/**
					* 获取： 体检项目详情
					*/
					public String getTijianxiangmuContent() {
						return tijianxiangmuContent;
					}
					/**
					* 设置： 体检项目详情
					*/
					public void setTijianxiangmuContent(String tijianxiangmuContent) {
						this.tijianxiangmuContent = tijianxiangmuContent;
					}





				//级联表的get和set yonghu
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
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 住址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 住址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 出生日期
					*/
					public String getYonghuChushengriqi() {
						return yonghuChushengriqi;
					}
					/**
					* 设置： 出生日期
					*/
					public void setYonghuChushengriqi(String yonghuChushengriqi) {
						this.yonghuChushengriqi = yonghuChushengriqi;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
