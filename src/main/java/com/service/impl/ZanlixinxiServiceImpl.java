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


import com.dao.ZanlixinxiDao;
import com.entity.ZanlixinxiEntity;
import com.service.ZanlixinxiService;
import com.entity.vo.ZanlixinxiVO;
import com.entity.view.ZanlixinxiView;

@Service("zanlixinxiService")
public class ZanlixinxiServiceImpl extends ServiceImpl<ZanlixinxiDao, ZanlixinxiEntity> implements ZanlixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZanlixinxiEntity> page = this.selectPage(
                new Query<ZanlixinxiEntity>(params).getPage(),
                new EntityWrapper<ZanlixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZanlixinxiEntity> wrapper) {
		  Page<ZanlixinxiView> page =new Query<ZanlixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZanlixinxiVO> selectListVO(Wrapper<ZanlixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZanlixinxiVO selectVO(Wrapper<ZanlixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZanlixinxiView> selectListView(Wrapper<ZanlixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZanlixinxiView selectView(Wrapper<ZanlixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
