package com.entity.view;

import com.entity.ZizhujianshenEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 自助健身
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zizhujianshen")
public class ZizhujianshenView extends ZizhujianshenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 自助健身类型的值
		*/
		private String zizhujianshenValue;



	public ZizhujianshenView() {

	}

	public ZizhujianshenView(ZizhujianshenEntity zizhujianshenEntity) {
		try {
			BeanUtils.copyProperties(this, zizhujianshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
















}
