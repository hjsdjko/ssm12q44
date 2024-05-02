package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuizuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuizuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuizuoxinxiView;


/**
 * 退座信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface TuizuoxinxiService extends IService<TuizuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuizuoxinxiVO> selectListVO(Wrapper<TuizuoxinxiEntity> wrapper);
   	
   	TuizuoxinxiVO selectVO(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
   	
   	List<TuizuoxinxiView> selectListView(Wrapper<TuizuoxinxiEntity> wrapper);
   	
   	TuizuoxinxiView selectView(@Param("ew") Wrapper<TuizuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuizuoxinxiEntity> wrapper);
   	
}

