package com.entity.model;

import com.entity.KetangyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 堂课预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KetangyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程
     */
    private Integer ketangId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约审核
     */
    private Integer ketangyuyueYesnoTypes;


    /**
     * 审核原因
     */
    private String ketangyuyueYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：课程
	 */
    public Integer getKetangId() {
        return ketangId;
    }


    /**
	 * 设置：课程
	 */
    public void setKetangId(Integer ketangId) {
        this.ketangId = ketangId;
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
    public Integer getKetangyuyueYesnoTypes() {
        return ketangyuyueYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setKetangyuyueYesnoTypes(Integer ketangyuyueYesnoTypes) {
        this.ketangyuyueYesnoTypes = ketangyuyueYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getKetangyuyueYesnoText() {
        return ketangyuyueYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setKetangyuyueYesnoText(String ketangyuyueYesnoText) {
        this.ketangyuyueYesnoText = ketangyuyueYesnoText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
