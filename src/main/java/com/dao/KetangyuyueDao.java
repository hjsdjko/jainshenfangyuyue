package com.dao;

import com.entity.KetangyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangyuyueView;

/**
 * 堂课预约 Dao 接口
 *
 * @author 
 */
public interface KetangyuyueDao extends BaseMapper<KetangyuyueEntity> {

   List<KetangyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
