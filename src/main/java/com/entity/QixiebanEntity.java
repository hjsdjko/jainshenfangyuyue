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
 * 器械班
 *
 * @author 
 * @email
 */
@TableName("qixieban")
public class QixiebanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QixiebanEntity() {

	}

	public QixiebanEntity(T t) {
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
     * 器械班名称
     */
    @TableField(value = "qixieban_name")

    private String qixiebanName;


    /**
     * 器械班类型
     */
    @TableField(value = "qixieban_types")

    private Integer qixiebanTypes;


    /**
     * 器械班图片
     */
    @TableField(value = "qixieban_photo")

    private String qixiebanPhoto;


    /**
     * 器械班详情
     */
    @TableField(value = "qixieban_content")

    private String qixiebanContent;


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
	 * 设置：器械班名称
	 */
    public String getQixiebanName() {
        return qixiebanName;
    }


    /**
	 * 获取：器械班名称
	 */

    public void setQixiebanName(String qixiebanName) {
        this.qixiebanName = qixiebanName;
    }
    /**
	 * 设置：器械班类型
	 */
    public Integer getQixiebanTypes() {
        return qixiebanTypes;
    }


    /**
	 * 获取：器械班类型
	 */

    public void setQixiebanTypes(Integer qixiebanTypes) {
        this.qixiebanTypes = qixiebanTypes;
    }
    /**
	 * 设置：器械班图片
	 */
    public String getQixiebanPhoto() {
        return qixiebanPhoto;
    }


    /**
	 * 获取：器械班图片
	 */

    public void setQixiebanPhoto(String qixiebanPhoto) {
        this.qixiebanPhoto = qixiebanPhoto;
    }
    /**
	 * 设置：器械班详情
	 */
    public String getQixiebanContent() {
        return qixiebanContent;
    }


    /**
	 * 获取：器械班详情
	 */

    public void setQixiebanContent(String qixiebanContent) {
        this.qixiebanContent = qixiebanContent;
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
        return "Qixieban{" +
            "id=" + id +
            ", qixiebanName=" + qixiebanName +
            ", qixiebanTypes=" + qixiebanTypes +
            ", qixiebanPhoto=" + qixiebanPhoto +
            ", qixiebanContent=" + qixiebanContent +
            ", createTime=" + createTime +
        "}";
    }
}
