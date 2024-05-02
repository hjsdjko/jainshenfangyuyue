package com.entity.model;

import com.entity.SijiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 私教课程预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SijiaoyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程
     */
    private Integer sijiaoId;


    /**
     * 用户
     */
    private Integer yonghuId;




    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    private Date ketangyuyueTime;


    /**
     * 预约审核
     */
    private Integer sijiaoyuyueYesnoTypes;


    /**
     * 审核原因
     */
    private String sijiaoyuyueYesnoText;


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
    public Integer getSijiaoId() {
        return sijiaoId;
    }


    /**
	 * 设置：课程
	 */
    public void setSijiaoId(Integer sijiaoId) {
        this.sijiaoId = sijiaoId;
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
	 * 获取：预约时间
	 */
    public Date getKetangyuyueTime() {
        return ketangyuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setKetangyuyueTime(Date ketangyuyueTime) {
        this.ketangyuyueTime = ketangyuyueTime;
    }
    /**
	 * 获取：预约审核
	 */
    public Integer getSijiaoyuyueYesnoTypes() {
        return sijiaoyuyueYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setSijiaoyuyueYesnoTypes(Integer sijiaoyuyueYesnoTypes) {
        this.sijiaoyuyueYesnoTypes = sijiaoyuyueYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getSijiaoyuyueYesnoText() {
        return sijiaoyuyueYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setSijiaoyuyueYesnoText(String sijiaoyuyueYesnoText) {
        this.sijiaoyuyueYesnoText = sijiaoyuyueYesnoText;
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
