package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TuizuoxinxiEntity;
import com.entity.view.TuizuoxinxiView;

import com.service.TuizuoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 退座信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
@RestController
@RequestMapping("/tuizuoxinxi")
public class TuizuoxinxiController {
    @Autowired
    private TuizuoxinxiService tuizuoxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuizuoxinxiEntity tuizuoxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			tuizuoxinxi.setXuejihao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuizuoxinxiEntity> ew = new EntityWrapper<TuizuoxinxiEntity>();
		PageUtils page = tuizuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuizuoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuizuoxinxiEntity tuizuoxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			tuizuoxinxi.setXuejihao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuizuoxinxiEntity> ew = new EntityWrapper<TuizuoxinxiEntity>();
		PageUtils page = tuizuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuizuoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuizuoxinxiEntity tuizuoxinxi){
       	EntityWrapper<TuizuoxinxiEntity> ew = new EntityWrapper<TuizuoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuizuoxinxi, "tuizuoxinxi")); 
        return R.ok().put("data", tuizuoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuizuoxinxiEntity tuizuoxinxi){
        EntityWrapper< TuizuoxinxiEntity> ew = new EntityWrapper< TuizuoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuizuoxinxi, "tuizuoxinxi")); 
		TuizuoxinxiView tuizuoxinxiView =  tuizuoxinxiService.selectView(ew);
		return R.ok("查询退座信息成功").put("data", tuizuoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuizuoxinxiEntity tuizuoxinxi = tuizuoxinxiService.selectById(id);
        return R.ok().put("data", tuizuoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuizuoxinxiEntity tuizuoxinxi = tuizuoxinxiService.selectById(id);
        return R.ok().put("data", tuizuoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuizuoxinxiEntity tuizuoxinxi, HttpServletRequest request){
    	tuizuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuizuoxinxi);

        tuizuoxinxiService.insert(tuizuoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuizuoxinxiEntity tuizuoxinxi, HttpServletRequest request){
    	tuizuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuizuoxinxi);
    	tuizuoxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        tuizuoxinxiService.insert(tuizuoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuizuoxinxiEntity tuizuoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuizuoxinxi);
        tuizuoxinxiService.updateById(tuizuoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuizuoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TuizuoxinxiEntity> wrapper = new EntityWrapper<TuizuoxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuejihao", (String)request.getSession().getAttribute("username"));
		}

		int count = tuizuoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
