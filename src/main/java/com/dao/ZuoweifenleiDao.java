package com.dao;

import com.entity.ZuoweifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweifenleiVO;
import com.entity.view.ZuoweifenleiView;


/**
 * 座位分类
 * 
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface ZuoweifenleiDao extends BaseMapper<ZuoweifenleiEntity> {
	
	List<ZuoweifenleiVO> selectListVO(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
	
	ZuoweifenleiVO selectVO(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
	
	List<ZuoweifenleiView> selectListView(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);

	List<ZuoweifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
	
	ZuoweifenleiView selectView(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
	
}
