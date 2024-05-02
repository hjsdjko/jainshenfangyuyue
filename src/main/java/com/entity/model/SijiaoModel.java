package com.entity.model;

import com.entity.SijiaoEntity;

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
public class SijiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String sijiaoName;


    /**
     * 课程类型
     */
    private Integer sijiaoTypes;


    /**
     * 教练
     */
    private Integer jiaolianId;


    /**
     * 课程图片
     */
    private String sijiaoPhoto;


    /**
     * 课程价格
     */
    private String sijiaoJiage;


    /**
     * 私教课程详情
     */
    private String sijiaoContent;


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
	 * 获取：课程名称
	 */
    public String getSijiaoName() {
        return sijiaoName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setSijiaoName(String sijiaoName) {
        this.sijiaoName = sijiaoName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getSijiaoTypes() {
        return sijiaoTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setSijiaoTypes(Integer sijiaoTypes) {
        this.sijiaoTypes = sijiaoTypes;
    }
    /**
	 * 获取：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 设置：教练
	 */
    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 获取：课程图片
	 */
    public String getSijiaoPhoto() {
        return sijiaoPhoto;
    }


    /**
	 * 设置：课程图片
	 */
    public void setSijiaoPhoto(String sijiaoPhoto) {
        this.sijiaoPhoto = sijiaoPhoto;
    }
    /**
	 * 获取：课程价格
	 */
    public String getSijiaoJiage() {
        return sijiaoJiage;
    }


    /**
	 * 设置：课程价格
	 */
    public void setSijiaoJiage(String sijiaoJiage) {
        this.sijiaoJiage = sijiaoJiage;
    }
    /**
	 * 获取：私教课程详情
	 */
    public String getSijiaoContent() {
        return sijiaoContent;
    }


    /**
	 * 设置：私教课程详情
	 */
    public void setSijiaoContent(String sijiaoContent) {
        this.sijiaoContent = sijiaoContent;
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
