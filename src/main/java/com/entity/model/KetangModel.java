package com.entity.model;

import com.entity.KetangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 堂课
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KetangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 堂课名称
     */
    private String ketangName;


    /**
     * 堂课类型
     */
    private Integer ketangTypes;


    /**
     * 堂课图片
     */
    private String ketangPhoto;


    /**
     * 堂课详情
     */
    private String ketangContent;


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
	 * 获取：堂课名称
	 */
    public String getKetangName() {
        return ketangName;
    }


    /**
	 * 设置：堂课名称
	 */
    public void setKetangName(String ketangName) {
        this.ketangName = ketangName;
    }
    /**
	 * 获取：堂课类型
	 */
    public Integer getKetangTypes() {
        return ketangTypes;
    }


    /**
	 * 设置：堂课类型
	 */
    public void setKetangTypes(Integer ketangTypes) {
        this.ketangTypes = ketangTypes;
    }
    /**
	 * 获取：堂课图片
	 */
    public String getKetangPhoto() {
        return ketangPhoto;
    }


    /**
	 * 设置：堂课图片
	 */
    public void setKetangPhoto(String ketangPhoto) {
        this.ketangPhoto = ketangPhoto;
    }
    /**
	 * 获取：堂课详情
	 */
    public String getKetangContent() {
        return ketangContent;
    }


    /**
	 * 设置：堂课详情
	 */
    public void setKetangContent(String ketangContent) {
        this.ketangContent = ketangContent;
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
