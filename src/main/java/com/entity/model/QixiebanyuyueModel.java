package com.entity.model;

import com.entity.QixiebanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 器械班预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QixiebanyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 器械班
     */
    private Integer qixiebanId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约审核
     */
    private Integer qixiebanyuyueYesnoTypes;


    /**
     * 审核原因
     */
    private String qixiebanyuyueYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：器械班
	 */
    public Integer getQixiebanId() {
        return qixiebanId;
    }


    /**
	 * 设置：器械班
	 */
    public void setQixiebanId(Integer qixiebanId) {
        this.qixiebanId = qixiebanId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约审核
	 */
    public Integer getQixiebanyuyueYesnoTypes() {
        return qixiebanyuyueYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setQixiebanyuyueYesnoTypes(Integer qixiebanyuyueYesnoTypes) {
        this.qixiebanyuyueYesnoTypes = qixiebanyuyueYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getQixiebanyuyueYesnoText() {
        return qixiebanyuyueYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setQixiebanyuyueYesnoText(String qixiebanyuyueYesnoText) {
        this.qixiebanyuyueYesnoText = qixiebanyuyueYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
