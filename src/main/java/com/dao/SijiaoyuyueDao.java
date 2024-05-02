package com.dao;

import com.entity.SijiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SijiaoyuyueView;

/**
 * 私教课程预约 Dao 接口
 *
 * @author 
 */
public interface SijiaoyuyueDao extends BaseMapper<SijiaoyuyueEntity> {

   List<SijiaoyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
