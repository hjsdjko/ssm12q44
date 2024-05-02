package com.entity.view;

import com.entity.ZanlixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 暂离信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
@TableName("zanlixinxi")
public class ZanlixinxiView  extends ZanlixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZanlixinxiView(){
	}
 
 	public ZanlixinxiView(ZanlixinxiEntity zanlixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zanlixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
