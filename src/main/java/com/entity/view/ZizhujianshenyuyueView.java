package com.entity.view;

import com.entity.ZizhujianshenyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 自助健身预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zizhujianshenyuyue")
public class ZizhujianshenyuyueView extends ZizhujianshenyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;




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

		//级联表 zizhujianshen
			/**
			* 自助健身名称
			*/
			private String zizhujianshenName;
			/**
			* 自助健身类型
			*/
			private Integer zizhujianshenTypes;
				/**
				* 自助健身类型的值
				*/
				private String zizhujianshenValue;
			/**
			* 自助健身图片
			*/
			private String zizhujianshenPhoto;
			/**
			* 可预约人数
			*/
			private Integer zizhujianshenNumber;
			/**
			* 可预约时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
			@DateTimeFormat
			private Date zizhujianshenTime;
			/**
			* 自助健身详情
			*/
			private String zizhujianshenContent;

	public ZizhujianshenyuyueView() {

	}

	public ZizhujianshenyuyueView(ZizhujianshenyuyueEntity zizhujianshenyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, zizhujianshenyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


				//级联表的get和set zizhujianshen
					/**
					* 获取： 自助健身名称
					*/
					public String getZizhujianshenName() {
						return zizhujianshenName;
					}
					/**
					* 设置： 自助健身名称
					*/
					public void setZizhujianshenName(String zizhujianshenName) {
						this.zizhujianshenName = zizhujianshenName;
					}
					/**
					* 获取： 自助健身类型
					*/
					public Integer getZizhujianshenTypes() {
						return zizhujianshenTypes;
					}
					/**
					* 设置： 自助健身类型
					*/
					public void setZizhujianshenTypes(Integer zizhujianshenTypes) {
						this.zizhujianshenTypes = zizhujianshenTypes;
					}


						/**
						* 获取： 自助健身类型的值
						*/
						public String getZizhujianshenValue() {
							return zizhujianshenValue;
						}
						/**
						* 设置： 自助健身类型的值
						*/
						public void setZizhujianshenValue(String zizhujianshenValue) {
							this.zizhujianshenValue = zizhujianshenValue;
						}
					/**
					* 获取： 自助健身图片
					*/
					public String getZizhujianshenPhoto() {
						return zizhujianshenPhoto;
					}
					/**
					* 设置： 自助健身图片
					*/
					public void setZizhujianshenPhoto(String zizhujianshenPhoto) {
						this.zizhujianshenPhoto = zizhujianshenPhoto;
					}
					/**
					* 获取： 可预约人数
					*/
					public Integer getZizhujianshenNumber() {
						return zizhujianshenNumber;
					}
					/**
					* 设置： 可预约人数
					*/
					public void setZizhujianshenNumber(Integer zizhujianshenNumber) {
						this.zizhujianshenNumber = zizhujianshenNumber;
					}
					/**
					* 获取： 可预约时间
					*/
					public Date getZizhujianshenTime() {
						return zizhujianshenTime;
					}
					/**
					* 设置： 可预约时间
					*/
					public void setZizhujianshenTime(Date zizhujianshenTime) {
						this.zizhujianshenTime = zizhujianshenTime;
					}
					/**
					* 获取： 自助健身详情
					*/
					public String getZizhujianshenContent() {
						return zizhujianshenContent;
					}
					/**
					* 设置： 自助健身详情
					*/
					public void setZizhujianshenContent(String zizhujianshenContent) {
						this.zizhujianshenContent = zizhujianshenContent;
					}







}
