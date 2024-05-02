package com.entity.vo;

import com.entity.QixiebanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器械班
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qixieban")
public class QixiebanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 器械班名称
     */

    @TableField(value = "qixieban_name")
    private String qixiebanName;


    /**
     * 器械班类型
     */

    @TableField(value = "qixieban_types")
    private Integer qixiebanTypes;


    /**
     * 器械班图片
     */

    @TableField(value = "qixieban_photo")
    private String qixiebanPhoto;


    /**
     * 器械班详情
     */

    @TableField(value = "qixieban_content")
    private String qixiebanContent;


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
	 * 设置：器械班名称
	 */
    public String getQixiebanName() {
        return qixiebanName;
    }


    /**
	 * 获取：器械班名称
	 */

    public void setQixiebanName(String qixiebanName) {
        this.qixiebanName = qixiebanName;
    }
    /**
	 * 设置：器械班类型
	 */
    public Integer getQixiebanTypes() {
        return qixiebanTypes;
    }


    /**
	 * 获取：器械班类型
	 */

    public void setQixiebanTypes(Integer qixiebanTypes) {
        this.qixiebanTypes = qixiebanTypes;
    }
    /**
	 * 设置：器械班图片
	 */
    public String getQixiebanPhoto() {
        return qixiebanPhoto;
    }


    /**
	 * 获取：器械班图片
	 */

    public void setQixiebanPhoto(String qixiebanPhoto) {
        this.qixiebanPhoto = qixiebanPhoto;
    }
    /**
	 * 设置：器械班详情
	 */
    public String getQixiebanContent() {
        return qixiebanContent;
    }


    /**
	 * 获取：器械班详情
	 */

    public void setQixiebanContent(String qixiebanContent) {
        this.qixiebanContent = qixiebanContent;
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
