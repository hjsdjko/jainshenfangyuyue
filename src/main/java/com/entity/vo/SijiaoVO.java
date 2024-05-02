package com.entity.vo;

import com.entity.SijiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 私教课程预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("sijiao")
public class SijiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "sijiao_name")
    private String sijiaoName;


    /**
     * 课程类型
     */

    @TableField(value = "sijiao_types")
    private Integer sijiaoTypes;


    /**
     * 教练
     */

    @TableField(value = "jiaolian_id")
    private Integer jiaolianId;


    /**
     * 课程图片
     */

    @TableField(value = "sijiao_photo")
    private String sijiaoPhoto;


    /**
     * 课程价格
     */

    @TableField(value = "sijiao_jiage")
    private String sijiaoJiage;


    /**
     * 私教课程详情
     */

    @TableField(value = "sijiao_content")
    private String sijiaoContent;


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
	 * 设置：课程名称
	 */
    public String getSijiaoName() {
        return sijiaoName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setSijiaoName(String sijiaoName) {
        this.sijiaoName = sijiaoName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getSijiaoTypes() {
        return sijiaoTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setSijiaoTypes(Integer sijiaoTypes) {
        this.sijiaoTypes = sijiaoTypes;
    }
    /**
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：课程图片
	 */
    public String getSijiaoPhoto() {
        return sijiaoPhoto;
    }


    /**
	 * 获取：课程图片
	 */

    public void setSijiaoPhoto(String sijiaoPhoto) {
        this.sijiaoPhoto = sijiaoPhoto;
    }
    /**
	 * 设置：课程价格
	 */
    public String getSijiaoJiage() {
        return sijiaoJiage;
    }


    /**
	 * 获取：课程价格
	 */

    public void setSijiaoJiage(String sijiaoJiage) {
        this.sijiaoJiage = sijiaoJiage;
    }
    /**
	 * 设置：私教课程详情
	 */
    public String getSijiaoContent() {
        return sijiaoContent;
    }


    /**
	 * 获取：私教课程详情
	 */

    public void setSijiaoContent(String sijiaoContent) {
        this.sijiaoContent = sijiaoContent;
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
