package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZanlixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZanlixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZanlixinxiView;


/**
 * 暂离信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface ZanlixinxiService extends IService<ZanlixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZanlixinxiVO> selectListVO(Wrapper<ZanlixinxiEntity> wrapper);
   	
   	ZanlixinxiVO selectVO(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
   	
   	List<ZanlixinxiView> selectListView(Wrapper<ZanlixinxiEntity> wrapper);
   	
   	ZanlixinxiView selectView(@Param("ew") Wrapper<ZanlixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZanlixinxiEntity> wrapper);
   	
}

