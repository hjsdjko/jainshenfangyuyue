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
 * 器械班预约
 *
 * @author 
 * @email
 */
@TableName("qixiebanyuyue")
public class QixiebanyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QixiebanyuyueEntity() {

	}

	public QixiebanyuyueEntity(T t) {
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
     * 器械班
     */
    @TableField(value = "qixieban_id")

    private Integer qixiebanId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约审核
     */
    @TableField(value = "qixiebanyuyue_yesno_types")

    private Integer qixiebanyuyueYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "qixiebanyuyue_yesno_text")

    private String qixiebanyuyueYesnoText;


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
	 * 设置：器械班
	 */
    public Integer getQixiebanId() {
        return qixiebanId;
    }


    /**
	 * 获取：器械班
	 */

    public void setQixiebanId(Integer qixiebanId) {
        this.qixiebanId = qixiebanId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约审核
	 */
    public Integer getQixiebanyuyueYesnoTypes() {
        return qixiebanyuyueYesnoTypes;
    }


    /**
	 * 获取：预约审核
	 */

    public void setQixiebanyuyueYesnoTypes(Integer qixiebanyuyueYesnoTypes) {
        this.qixiebanyuyueYesnoTypes = qixiebanyuyueYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getQixiebanyuyueYesnoText() {
        return qixiebanyuyueYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setQixiebanyuyueYesnoText(String qixiebanyuyueYesnoText) {
        this.qixiebanyuyueYesnoText = qixiebanyuyueYesnoText;
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
        return "Qixiebanyuyue{" +
            "id=" + id +
            ", qixiebanId=" + qixiebanId +
            ", yonghuId=" + yonghuId +
            ", qixiebanyuyueYesnoTypes=" + qixiebanyuyueYesnoTypes +
            ", qixiebanyuyueYesnoText=" + qixiebanyuyueYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
