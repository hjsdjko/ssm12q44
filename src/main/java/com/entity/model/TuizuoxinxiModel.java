package com.entity.model;

import com.entity.TuizuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 退座信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
public class TuizuoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 座位编号
	 */
	
	private String zuoweibianhao;
		
	/**
	 * 座位分类
	 */
	
	private String zuoweifenlei;
		
	/**
	 * 学籍号
	 */
	
	private String xuejihao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 退座时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuizuoshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：座位编号
	 */
	 
	public void setZuoweibianhao(String zuoweibianhao) {
		this.zuoweibianhao = zuoweibianhao;
	}
	
	/**
	 * 获取：座位编号
	 */
	public String getZuoweibianhao() {
		return zuoweibianhao;
	}
				
	
	/**
	 * 设置：座位分类
	 */
	 
	public void setZuoweifenlei(String zuoweifenlei) {
		this.zuoweifenlei = zuoweifenlei;
	}
	
	/**
	 * 获取：座位分类
	 */
	public String getZuoweifenlei() {
		return zuoweifenlei;
	}
				
	
	/**
	 * 设置：学籍号
	 */
	 
	public void setXuejihao(String xuejihao) {
		this.xuejihao = xuejihao;
	}
	
	/**
	 * 获取：学籍号
	 */
	public String getXuejihao() {
		return xuejihao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：退座时间
	 */
	 
	public void setTuizuoshijian(Date tuizuoshijian) {
		this.tuizuoshijian = tuizuoshijian;
	}
	
	/**
	 * 获取：退座时间
	 */
	public Date getTuizuoshijian() {
		return tuizuoshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
