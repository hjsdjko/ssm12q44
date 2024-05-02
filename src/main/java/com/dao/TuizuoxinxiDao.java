package com.dao;

import com.entity.TuizuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuizuoxinxiVO;
import com.entity.view.TuizuoxinxiView;


/**
 * 退座信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface TuizuoxinxiDao extends BaseMapper<TuizuoxinxiEntity> {
	
	List<TuizuoxinxiVO> selectListVO(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
	
	TuizuoxinxiVO selectVO(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
	
	List<TuizuoxinxiView> selectListView(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);

	List<TuizuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
	
	TuizuoxinxiView selectView(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
	
}
