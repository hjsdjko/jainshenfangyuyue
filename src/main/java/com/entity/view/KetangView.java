package com.entity.view;

import com.entity.KetangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 堂课
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("ketang")
public class KetangView extends KetangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 堂课类型的值
		*/
		private String ketangValue;



	public KetangView() {

	}

	public KetangView(KetangEntity ketangEntity) {
		try {
			BeanUtils.copyProperties(this, ketangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 堂课类型的值
			*/
			public String getKetangValue() {
				return ketangValue;
			}
			/**
			* 设置： 堂课类型的值
			*/
			public void setKetangValue(String ketangValue) {
				this.ketangValue = ketangValue;
			}
















}
