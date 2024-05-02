package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuizuoxinxiDao;
import com.entity.TuizuoxinxiEntity;
import com.service.TuizuoxinxiService;
import com.entity.vo.TuizuoxinxiVO;
import com.entity.view.TuizuoxinxiView;

@Service("tuizuoxinxiService")
public class TuizuoxinxiServiceImpl extends ServiceImpl<TuizuoxinxiDao, TuizuoxinxiEntity> implements TuizuoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuizuoxinxiEntity> page = this.selectPage(
                new Query<TuizuoxinxiEntity>(params).getPage(),
                new EntityWrapper<TuizuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuizuoxinxiEntity> wrapper) {
		  Page<TuizuoxinxiView> page =new Query<TuizuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuizuoxinxiVO> selectListVO(Wrapper<TuizuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuizuoxinxiVO selectVO(Wrapper<TuizuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuizuoxinxiView> selectListView(Wrapper<TuizuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuizuoxinxiView selectView(Wrapper<TuizuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
