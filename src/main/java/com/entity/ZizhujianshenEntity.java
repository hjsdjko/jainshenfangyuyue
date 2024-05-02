package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 自助健身
 *
 * @author 
 * @email
 */
@TableName("zizhujianshen")
public class ZizhujianshenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZizhujianshenEntity() {

	}

	public ZizhujianshenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 自助健身名称
     */
    @TableField(value = "zizhujianshen_name")

    private String zizhujianshenName;


    /**
     * 自助健身类型
     */
    @TableField(value = "zizhujianshen_types")

    private Integer zizhujianshenTypes;


    /**
     * 自助健身图片
     */
    @TableField(value = "zizhujianshen_photo")

    private String zizhujianshenPhoto;


    /**
     * 可预约人数
     */
    @TableField(value = "zizhujianshen_number")

    private Integer zizhujianshenNumber;


    /**
     * 可预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "zizhujianshen_time")

    private Date zizhujianshenTime;


    /**
     * 自助健身详情
     */
    @TableField(value = "zizhujianshen_content")

    private String zizhujianshenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：自助健身名称
	 */
    public String getZizhujianshenName() {
        return zizhujianshenName;
    }


    /**
	 * 获取：自助健身名称
	 */

    public void setZizhujianshenName(String zizhujianshenName) {
        this.zizhujianshenName = zizhujianshenName;
    }
    /**
	 * 设置：自助健身类型
	 */
    public Integer getZizhujianshenTypes() {
        return zizhujianshenTypes;
    }


    /**
	 * 获取：自助健身类型
	 */

    public void setZizhujianshenTypes(Integer zizhujianshenTypes) {
        this.zizhujianshenTypes = zizhujianshenTypes;
    }
    /**
	 * 设置：自助健身图片
	 */
    public String getZizhujianshenPhoto() {
        return zizhujianshenPhoto;
    }


    /**
	 * 获取：自助健身图片
	 */

    public void setZizhujianshenPhoto(String zizhujianshenPhoto) {
        this.zizhujianshenPhoto = zizhujianshenPhoto;
    }
    /**
	 * 设置：可预约人数
	 */
    public Integer getZizhujianshenNumber() {
        return zizhujianshenNumber;
    }


    /**
	 * 获取：可预约人数
	 */

    public void setZizhujianshenNumber(Integer zizhujianshenNumber) {
        this.zizhujianshenNumber = zizhujianshenNumber;
    }
    /**
	 * 设置：可预约时间
	 */
    public Date getZizhujianshenTime() {
        return zizhujianshenTime;
    }


    /**
	 * 获取：可预约时间
	 */

    public void setZizhujianshenTime(Date zizhujianshenTime) {
        this.zizhujianshenTime = zizhujianshenTime;
    }
    /**
	 * 设置：自助健身详情
	 */
    public String getZizhujianshenContent() {
        return zizhujianshenContent;
    }


    /**
	 * 获取：自助健身详情
	 */

    public void setZizhujianshenContent(String zizhujianshenContent) {
        this.zizhujianshenContent = zizhujianshenContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zizhujianshen{" +
            "id=" + id +
            ", zizhujianshenName=" + zizhujianshenName +
            ", zizhujianshenTypes=" + zizhujianshenTypes +
            ", zizhujianshenPhoto=" + zizhujianshenPhoto +
            ", zizhujianshenNumber=" + zizhujianshenNumber +
            ", zizhujianshenTime=" + zizhujianshenTime +
            ", zizhujianshenContent=" + zizhujianshenContent +
            ", createTime=" + createTime +
        "}";
    }
}
