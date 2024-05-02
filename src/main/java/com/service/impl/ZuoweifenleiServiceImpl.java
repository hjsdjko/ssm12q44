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


import com.dao.ZuoweifenleiDao;
import com.entity.ZuoweifenleiEntity;
import com.service.ZuoweifenleiService;
import com.entity.vo.ZuoweifenleiVO;
import com.entity.view.ZuoweifenleiView;

@Service("zuoweifenleiService")
public class ZuoweifenleiServiceImpl extends ServiceImpl<ZuoweifenleiDao, ZuoweifenleiEntity> implements ZuoweifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweifenleiEntity> page = this.selectPage(
                new Query<ZuoweifenleiEntity>(params).getPage(),
                new EntityWrapper<ZuoweifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweifenleiEntity> wrapper) {
		  Page<ZuoweifenleiView> page =new Query<ZuoweifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweifenleiVO> selectListVO(Wrapper<ZuoweifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweifenleiVO selectVO(Wrapper<ZuoweifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweifenleiView> selectListView(Wrapper<ZuoweifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweifenleiView selectView(Wrapper<ZuoweifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
