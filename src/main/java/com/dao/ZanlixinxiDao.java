package com.dao;

import com.entity.ZanlixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZanlixinxiVO;
import com.entity.view.ZanlixinxiView;


/**
 * 暂离信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface ZanlixinxiDao extends BaseMapper<ZanlixinxiEntity> {
	
	List<ZanlixinxiVO> selectListVO(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
	
	ZanlixinxiVO selectVO(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
	
	List<ZanlixinxiView> selectListView(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);

	List<ZanlixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
	
	ZanlixinxiView selectView(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
	
}
