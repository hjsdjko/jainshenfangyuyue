package com.dao;

import com.entity.ZizhujianshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhujianshenView;

/**
 * 自助健身 Dao 接口
 *
 * @author 
 */
public interface ZizhujianshenDao extends BaseMapper<ZizhujianshenEntity> {

   List<ZizhujianshenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
