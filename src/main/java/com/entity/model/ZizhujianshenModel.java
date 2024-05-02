package com.entity.model;

import com.entity.ZizhujianshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 自助健身
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZizhujianshenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 自助健身名称
     */
    private String zizhujianshenName;


    /**
     * 自助健身类型
     */
    private Integer zizhujianshenTypes;


    /**
     * 自助健身图片
     */
    private String zizhujianshenPhoto;


    /**
     * 可预约人数
     */
    private Integer zizhujianshenNumber;


    /**
     * 可预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zizhujianshenTime;


    /**
     * 自助健身详情
     */
    private String zizhujianshenContent;


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
	 * 获取：自助健身名称
	 */
    public String getZizhujianshenName() {
        return zizhujianshenName;
    }


    /**
	 * 设置：自助健身名称
	 */
    public void setZizhujianshenName(String zizhujianshenName) {
        this.zizhujianshenName = zizhujianshenName;
    }
    /**
	 * 获取：自助健身类型
	 */
    public Integer getZizhujianshenTypes() {
        return zizhujianshenTypes;
    }


    /**
	 * 设置：自助健身类型
	 */
    public void setZizhujianshenTypes(Integer zizhujianshenTypes) {
        this.zizhujianshenTypes = zizhujianshenTypes;
    }
    /**
	 * 获取：自助健身图片
	 */
    public String getZizhujianshenPhoto() {
        return zizhujianshenPhoto;
    }


    /**
	 * 设置：自助健身图片
	 */
    public void setZizhujianshenPhoto(String zizhujianshenPhoto) {
        this.zizhujianshenPhoto = zizhujianshenPhoto;
    }
    /**
	 * 获取：可预约人数
	 */
    public Integer getZizhujianshenNumber() {
        return zizhujianshenNumber;
    }


    /**
	 * 设置：可预约人数
	 */
    public void setZizhujianshenNumber(Integer zizhujianshenNumber) {
        this.zizhujianshenNumber = zizhujianshenNumber;
    }
    /**
	 * 获取：可预约时间
	 */
    public Date getZizhujianshenTime() {
        return zizhujianshenTime;
    }


    /**
	 * 设置：可预约时间
	 */
    public void setZizhujianshenTime(Date zizhujianshenTime) {
        this.zizhujianshenTime = zizhujianshenTime;
    }
    /**
	 * 获取：自助健身详情
	 */
    public String getZizhujianshenContent() {
        return zizhujianshenContent;
    }


    /**
	 * 设置：自助健身详情
	 */
    public void setZizhujianshenContent(String zizhujianshenContent) {
        this.zizhujianshenContent = zizhujianshenContent;
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
