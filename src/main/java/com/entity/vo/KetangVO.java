package com.entity.vo;

import com.entity.KetangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 堂课
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ketang")
public class KetangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 堂课名称
     */

    @TableField(value = "ketang_name")
    private String ketangName;


    /**
     * 堂课类型
     */

    @TableField(value = "ketang_types")
    private Integer ketangTypes;


    /**
     * 堂课图片
     */

    @TableField(value = "ketang_photo")
    private String ketangPhoto;


    /**
     * 堂课详情
     */

    @TableField(value = "ketang_content")
    private String ketangContent;


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
	 * 设置：堂课名称
	 */
    public String getKetangName() {
        return ketangName;
    }


    /**
	 * 获取：堂课名称
	 */

    public void setKetangName(String ketangName) {
        this.ketangName = ketangName;
    }
    /**
	 * 设置：堂课类型
	 */
    public Integer getKetangTypes() {
        return ketangTypes;
    }


    /**
	 * 获取：堂课类型
	 */

    public void setKetangTypes(Integer ketangTypes) {
        this.ketangTypes = ketangTypes;
    }
    /**
	 * 设置：堂课图片
	 */
    public String getKetangPhoto() {
        return ketangPhoto;
    }


    /**
	 * 获取：堂课图片
	 */

    public void setKetangPhoto(String ketangPhoto) {
        this.ketangPhoto = ketangPhoto;
    }
    /**
	 * 设置：堂课详情
	 */
    public String getKetangContent() {
        return ketangContent;
    }


    /**
	 * 获取：堂课详情
	 */

    public void setKetangContent(String ketangContent) {
        this.ketangContent = ketangContent;
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
