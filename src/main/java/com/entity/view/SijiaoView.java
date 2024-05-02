package com.entity.view;

import com.entity.SijiaoEntity;
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
@TableName("sijiao")
public class SijiaoView extends SijiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String sijiaoValue;



		//级联表 jiaolian
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 头像
			*/
			private String jiaolianPhoto;
			/**
			* 教练手机号
			*/
			private String jiaolianPhone;
			/**
			* 擅长项目
			*/
			private String jiaolianShanchangxiangmnu;
			/**
			* 所得奖项
			*/
			private String jiaolianSuodejiangxiang;
			/**
			* 邮箱
			*/
			private String jiaolianEmail;
			/**
			* 假删
			*/
			private Integer jiaolianDelete;

	public SijiaoView() {

	}

	public SijiaoView(SijiaoEntity sijiaoEntity) {
		try {
			BeanUtils.copyProperties(this, sijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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






				//级联表的get和set jiaolian
					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}
					/**
					* 获取： 头像
					*/
					public String getJiaolianPhoto() {
						return jiaolianPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setJiaolianPhoto(String jiaolianPhoto) {
						this.jiaolianPhoto = jiaolianPhoto;
					}
					/**
					* 获取： 教练手机号
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 教练手机号
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}
					/**
					* 获取： 擅长项目
					*/
					public String getJiaolianShanchangxiangmnu() {
						return jiaolianShanchangxiangmnu;
					}
					/**
					* 设置： 擅长项目
					*/
					public void setJiaolianShanchangxiangmnu(String jiaolianShanchangxiangmnu) {
						this.jiaolianShanchangxiangmnu = jiaolianShanchangxiangmnu;
					}
					/**
					* 获取： 所得奖项
					*/
					public String getJiaolianSuodejiangxiang() {
						return jiaolianSuodejiangxiang;
					}
					/**
					* 设置： 所得奖项
					*/
					public void setJiaolianSuodejiangxiang(String jiaolianSuodejiangxiang) {
						this.jiaolianSuodejiangxiang = jiaolianSuodejiangxiang;
					}
					/**
					* 获取： 邮箱
					*/
					public String getJiaolianEmail() {
						return jiaolianEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setJiaolianEmail(String jiaolianEmail) {
						this.jiaolianEmail = jiaolianEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getJiaolianDelete() {
						return jiaolianDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setJiaolianDelete(Integer jiaolianDelete) {
						this.jiaolianDelete = jiaolianDelete;
					}
























}
