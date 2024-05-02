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
 * 堂课
 *
 * @author 
 * @email
 */
@TableName("ketang")
public class KetangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KetangEntity() {

	}

	public KetangEntity(T t) {
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
     * 堂课名称
     */
    @TableField(value = "ketang_name")

    private String ketangName;


    /**
     * 堂课类型
     */
    @TableField(value = "ketang_types")

    private Integer ketangTypes;


    /**
     * 堂课图片
     */
    @TableField(value = "ketang_photo")

    private String ketangPhoto;


    /**
     * 堂课详情
     */
    @TableField(value = "ketang_content")

    private String ketangContent;


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
	 * 设置：堂课名称
	 */
    public String getKetangName() {
        return ketangName;
    }


    /**
	 * 获取：堂课名称
	 */

    public void setKetangName(String ketangName) {
        this.ketangName = ketangName;
    }
    /**
	 * 设置：堂课类型
	 */
    public Integer getKetangTypes() {
        return ketangTypes;
    }


    /**
	 * 获取：堂课类型
	 */

    public void setKetangTypes(Integer ketangTypes) {
        this.ketangTypes = ketangTypes;
    }
    /**
	 * 设置：堂课图片
	 */
    public String getKetangPhoto() {
        return ketangPhoto;
    }


    /**
	 * 获取：堂课图片
	 */

    public void setKetangPhoto(String ketangPhoto) {
        this.ketangPhoto = ketangPhoto;
    }
    /**
	 * 设置：堂课详情
	 */
    public String getKetangContent() {
        return ketangContent;
    }


    /**
	 * 获取：堂课详情
	 */

    public void setKetangContent(String ketangContent) {
        this.ketangContent = ketangContent;
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
        return "Ketang{" +
            "id=" + id +
            ", ketangName=" + ketangName +
            ", ketangTypes=" + ketangTypes +
            ", ketangPhoto=" + ketangPhoto +
            ", ketangContent=" + ketangContent +
            ", createTime=" + createTime +
        "}";
    }
}
