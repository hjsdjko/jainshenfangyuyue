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
@TableName("sijiaoyuyue")
public class SijiaoyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SijiaoyuyueEntity() {

	}

	public SijiaoyuyueEntity(T t) {
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
     * 课程
     */
    @TableField(value = "sijiao_id")

    private Integer sijiaoId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;




    /**
     * 预约审核
     */
    @TableField(value = "sijiaoyuyue_yesno_types")

    private Integer sijiaoyuyueYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "sijiaoyuyue_yesno_text")

    private String sijiaoyuyueYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "ketangyuyue_time",fill = FieldFill.INSERT)

    private Date ketangyuyueTime;

    public Date getKetangyuyueTime() {
        return ketangyuyueTime;
    }

    public void setKetangyuyueTime(Date ketangyuyueTime) {
        this.ketangyuyueTime = ketangyuyueTime;
    }

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
	 * 设置：课程
	 */
    public Integer getSijiaoId() {
        return sijiaoId;
    }


    /**
	 * 获取：课程
	 */

    public void setSijiaoId(Integer sijiaoId) {
        this.sijiaoId = sijiaoId;
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
    public Integer getSijiaoyuyueYesnoTypes() {
        return sijiaoyuyueYesnoTypes;
    }


    /**
	 * 获取：预约审核
	 */

    public void setSijiaoyuyueYesnoTypes(Integer sijiaoyuyueYesnoTypes) {
        this.sijiaoyuyueYesnoTypes = sijiaoyuyueYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getSijiaoyuyueYesnoText() {
        return sijiaoyuyueYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setSijiaoyuyueYesnoText(String sijiaoyuyueYesnoText) {
        this.sijiaoyuyueYesnoText = sijiaoyuyueYesnoText;
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
        return "Sijiaoyuyue{" +
            "id=" + id +
            ", sijiaoId=" + sijiaoId +
            ", yonghuId=" + yonghuId +
            ", sijiaoyuyueYesnoTypes=" + sijiaoyuyueYesnoTypes +
            ", sijiaoyuyueYesnoText=" + sijiaoyuyueYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
