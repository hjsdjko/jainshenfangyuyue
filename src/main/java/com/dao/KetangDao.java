package com.dao;

import com.entity.KetangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangView;

/**
 * 堂课 Dao 接口
 *
 * @author 
 */
public interface KetangDao extends BaseMapper<KetangEntity> {

   List<KetangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
