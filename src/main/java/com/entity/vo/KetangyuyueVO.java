package com.entity.vo;

import com.entity.KetangyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 堂课预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ketangyuyue")
public class KetangyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程
     */

    @TableField(value = "ketang_id")
    private Integer ketangId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约审核
     */

    @TableField(value = "ketangyuyue_yesno_types")
    private Integer ketangyuyueYesnoTypes;


    /**
     * 审核原因
     */

    @TableField(value = "ketangyuyue_yesno_text")
    private String ketangyuyueYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：课程
	 */
    public Integer getKetangId() {
        return ketangId;
    }


    /**
	 * 获取：课程
	 */

    public void setKetangId(Integer ketangId) {
        this.ketangId = ketangId;
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
    public Integer getKetangyuyueYesnoTypes() {
        return ketangyuyueYesnoTypes;
    }


    /**
	 * 获取：预约审核
	 */

    public void setKetangyuyueYesnoTypes(Integer ketangyuyueYesnoTypes) {
        this.ketangyuyueYesnoTypes = ketangyuyueYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getKetangyuyueYesnoText() {
        return ketangyuyueYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setKetangyuyueYesnoText(String ketangyuyueYesnoText) {
        this.ketangyuyueYesnoText = ketangyuyueYesnoText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
