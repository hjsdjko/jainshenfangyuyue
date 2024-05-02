package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.SijiaoyuyueDao;
import com.entity.SijiaoyuyueEntity;
import com.service.SijiaoyuyueService;
import com.entity.view.SijiaoyuyueView;

/**
 * 私教课程预约 服务实现类
 */
@Service("sijiaoyuyueService")
@Transactional
public class SijiaoyuyueServiceImpl extends ServiceImpl<SijiaoyuyueDao, SijiaoyuyueEntity> implements SijiaoyuyueService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<SijiaoyuyueView> page =new Query<SijiaoyuyueView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
