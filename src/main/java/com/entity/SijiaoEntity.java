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
 * 私教课程预约
 *
 * @author 
 * @email
 */
@TableName("sijiao")
public class SijiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SijiaoEntity() {

	}

	public SijiaoEntity(T t) {
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
     * 课程名称
     */
    @TableField(value = "sijiao_name")

    private String sijiaoName;


    /**
     * 课程类型
     */
    @TableField(value = "sijiao_types")

    private Integer sijiaoTypes;


    /**
     * 教练
     */
    @TableField(value = "jiaolian_id")

    private Integer jiaolianId;


    /**
     * 课程图片
     */
    @TableField(value = "sijiao_photo")

    private String sijiaoPhoto;


    /**
     * 课程价格
     */
    @TableField(value = "sijiao_jiage")

    private String sijiaoJiage;


    /**
     * 私教课程详情
     */
    @TableField(value = "sijiao_content")

    private String sijiaoContent;


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
	 * 设置：课程名称
	 */
    public String getSijiaoName() {
        return sijiaoName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setSijiaoName(String sijiaoName) {
        this.sijiaoName = sijiaoName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getSijiaoTypes() {
        return sijiaoTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setSijiaoTypes(Integer sijiaoTypes) {
        this.sijiaoTypes = sijiaoTypes;
    }
    /**
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：课程图片
	 */
    public String getSijiaoPhoto() {
        return sijiaoPhoto;
    }


    /**
	 * 获取：课程图片
	 */

    public void setSijiaoPhoto(String sijiaoPhoto) {
        this.sijiaoPhoto = sijiaoPhoto;
    }
    /**
	 * 设置：课程价格
	 */
    public String getSijiaoJiage() {
        return sijiaoJiage;
    }


    /**
	 * 获取：课程价格
	 */

    public void setSijiaoJiage(String sijiaoJiage) {
        this.sijiaoJiage = sijiaoJiage;
    }
    /**
	 * 设置：私教课程详情
	 */
    public String getSijiaoContent() {
        return sijiaoContent;
    }


    /**
	 * 获取：私教课程详情
	 */

    public void setSijiaoContent(String sijiaoContent) {
        this.sijiaoContent = sijiaoContent;
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
        return "Sijiao{" +
            "id=" + id +
            ", sijiaoName=" + sijiaoName +
            ", sijiaoTypes=" + sijiaoTypes +
            ", jiaolianId=" + jiaolianId +
            ", sijiaoPhoto=" + sijiaoPhoto +
            ", sijiaoJiage=" + sijiaoJiage +
            ", sijiaoContent=" + sijiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
