package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweifenleiView;


/**
 * 座位分类
 *
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public interface ZuoweifenleiService extends IService<ZuoweifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoweifenleiVO> selectListVO(Wrapper<ZuoweifenleiEntity> wrapper);
   	
   	ZuoweifenleiVO selectVO(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
   	
   	List<ZuoweifenleiView> selectListView(Wrapper<ZuoweifenleiEntity> wrapper);
   	
   	ZuoweifenleiView selectView(@Param("ew") Wrapper<ZuoweifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweifenleiEntity> wrapper);
   	
}

