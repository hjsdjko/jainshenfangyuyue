package com.entity.view;

import com.entity.QixiebanyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 器械班预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qixiebanyuyue")
public class QixiebanyuyueView extends QixiebanyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约审核的值
		*/
		private String qixiebanyuyueYesnoValue;



		//级联表 qixieban
			/**
			* 器械班名称
			*/
			private String qixiebanName;
			/**
			* 器械班类型
			*/
			private Integer qixiebanTypes;
				/**
				* 器械班类型的值
				*/
				private String qixiebanValue;
			/**
			* 器械班图片
			*/
			private String qixiebanPhoto;
			/**
			* 器械班详情
			*/
			private String qixiebanContent;

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
			* 用户手机号
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
			* 假删
			*/
			private Integer yonghuDelete;

	public QixiebanyuyueView() {

	}

	public QixiebanyuyueView(QixiebanyuyueEntity qixiebanyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, qixiebanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约审核的值
			*/
			public String getQixiebanyuyueYesnoValue() {
				return qixiebanyuyueYesnoValue;
			}
			/**
			* 设置： 预约审核的值
			*/
			public void setQixiebanyuyueYesnoValue(String qixiebanyuyueYesnoValue) {
				this.qixiebanyuyueYesnoValue = qixiebanyuyueYesnoValue;
			}






















				//级联表的get和set qixieban
					/**
					* 获取： 器械班名称
					*/
					public String getQixiebanName() {
						return qixiebanName;
					}
					/**
					* 设置： 器械班名称
					*/
					public void setQixiebanName(String qixiebanName) {
						this.qixiebanName = qixiebanName;
					}
					/**
					* 获取： 器械班类型
					*/
					public Integer getQixiebanTypes() {
						return qixiebanTypes;
					}
					/**
					* 设置： 器械班类型
					*/
					public void setQixiebanTypes(Integer qixiebanTypes) {
						this.qixiebanTypes = qixiebanTypes;
					}


						/**
						* 获取： 器械班类型的值
						*/
						public String getQixiebanValue() {
							return qixiebanValue;
						}
						/**
						* 设置： 器械班类型的值
						*/
						public void setQixiebanValue(String qixiebanValue) {
							this.qixiebanValue = qixiebanValue;
						}
					/**
					* 获取： 器械班图片
					*/
					public String getQixiebanPhoto() {
						return qixiebanPhoto;
					}
					/**
					* 设置： 器械班图片
					*/
					public void setQixiebanPhoto(String qixiebanPhoto) {
						this.qixiebanPhoto = qixiebanPhoto;
					}
					/**
					* 获取： 器械班详情
					*/
					public String getQixiebanContent() {
						return qixiebanContent;
					}
					/**
					* 设置： 器械班详情
					*/
					public void setQixiebanContent(String qixiebanContent) {
						this.qixiebanContent = qixiebanContent;
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
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
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
