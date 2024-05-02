package com.dao;

import com.entity.QixiebanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QixiebanView;

/**
 * 器械班 Dao 接口
 *
 * @author 
 */
public interface QixiebanDao extends BaseMapper<QixiebanEntity> {

   List<QixiebanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
