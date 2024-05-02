package com.entity.view;

import com.entity.SijiaoyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 私教课程预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sijiaoyuyue")
public class SijiaoyuyueView extends SijiaoyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约审核的值
		*/
		private String sijiaoyuyueYesnoValue;



		//级联表 sijiao
			/**
			* 课程名称
			*/
			private String sijiaoName;
			/**
			* 课程类型
			*/
			private Integer sijiaoTypes;
				/**
				* 课程类型的值
				*/
				private String sijiaoValue;
			/**
			* 私教课程预约 的 教练
			*/
			private Integer sijiaoJiaolianId;
			/**
			* 课程图片
			*/
			private String sijiaoPhoto;
			/**
			* 课程价格
			*/
			private String sijiaoJiage;
			/**
			* 私教课程详情
			*/
			private String sijiaoContent;

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

	public SijiaoyuyueView() {

	}

	public SijiaoyuyueView(SijiaoyuyueEntity sijiaoyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, sijiaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约审核的值
			*/
			public String getSijiaoyuyueYesnoValue() {
				return sijiaoyuyueYesnoValue;
			}
			/**
			* 设置： 预约审核的值
			*/
			public void setSijiaoyuyueYesnoValue(String sijiaoyuyueYesnoValue) {
				this.sijiaoyuyueYesnoValue = sijiaoyuyueYesnoValue;
			}




























				//级联表的get和set sijiao
					/**
					* 获取： 课程名称
					*/
					public String getSijiaoName() {
						return sijiaoName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setSijiaoName(String sijiaoName) {
						this.sijiaoName = sijiaoName;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getSijiaoTypes() {
						return sijiaoTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setSijiaoTypes(Integer sijiaoTypes) {
						this.sijiaoTypes = sijiaoTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getSijiaoValue() {
							return sijiaoValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setSijiaoValue(String sijiaoValue) {
							this.sijiaoValue = sijiaoValue;
						}
					/**
					* 获取：私教课程预约 的 教练
					*/
					public Integer getSijiaoJiaolianId() {
						return sijiaoJiaolianId;
					}
					/**
					* 设置：私教课程预约 的 教练
					*/
					public void setSijiaoJiaolianId(Integer sijiaoJiaolianId) {
						this.sijiaoJiaolianId = sijiaoJiaolianId;
					}

					/**
					* 获取： 课程图片
					*/
					public String getSijiaoPhoto() {
						return sijiaoPhoto;
					}
					/**
					* 设置： 课程图片
					*/
					public void setSijiaoPhoto(String sijiaoPhoto) {
						this.sijiaoPhoto = sijiaoPhoto;
					}
					/**
					* 获取： 课程价格
					*/
					public String getSijiaoJiage() {
						return sijiaoJiage;
					}
					/**
					* 设置： 课程价格
					*/
					public void setSijiaoJiage(String sijiaoJiage) {
						this.sijiaoJiage = sijiaoJiage;
					}
					/**
					* 获取： 私教课程详情
					*/
					public String getSijiaoContent() {
						return sijiaoContent;
					}
					/**
					* 设置： 私教课程详情
					*/
					public void setSijiaoContent(String sijiaoContent) {
						this.sijiaoContent = sijiaoContent;
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
