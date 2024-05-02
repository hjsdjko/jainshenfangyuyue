package com.entity.model;

import com.entity.QixiebanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 器械班
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QixiebanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 器械班名称
     */
    private String qixiebanName;


    /**
     * 器械班类型
     */
    private Integer qixiebanTypes;


    /**
     * 器械班图片
     */
    private String qixiebanPhoto;


    /**
     * 器械班详情
     */
    private String qixiebanContent;


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
	 * 获取：器械班名称
	 */
    public String getQixiebanName() {
        return qixiebanName;
    }


    /**
	 * 设置：器械班名称
	 */
    public void setQixiebanName(String qixiebanName) {
        this.qixiebanName = qixiebanName;
    }
    /**
	 * 获取：器械班类型
	 */
    public Integer getQixiebanTypes() {
        return qixiebanTypes;
    }


    /**
	 * 设置：器械班类型
	 */
    public void setQixiebanTypes(Integer qixiebanTypes) {
        this.qixiebanTypes = qixiebanTypes;
    }
    /**
	 * 获取：器械班图片
	 */
    public String getQixiebanPhoto() {
        return qixiebanPhoto;
    }


    /**
	 * 设置：器械班图片
	 */
    public void setQixiebanPhoto(String qixiebanPhoto) {
        this.qixiebanPhoto = qixiebanPhoto;
    }
    /**
	 * 获取：器械班详情
	 */
    public String getQixiebanContent() {
        return qixiebanContent;
    }


    /**
	 * 设置：器械班详情
	 */
    public void setQixiebanContent(String qixiebanContent) {
        this.qixiebanContent = qixiebanContent;
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
