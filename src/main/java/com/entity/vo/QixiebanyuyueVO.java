package com.entity.vo;

import com.entity.QixiebanyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器械班预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qixiebanyuyue")
public class QixiebanyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
