package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 座位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 12:22:28
 */
@TableName("zuoweixinxi")
public class ZuoweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoweixinxiEntity() {
		
	}
	
	public ZuoweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 座位编号
	 */
					
	private String zuoweibianhao;
	
	/**
	 * 座位分类
	 */
					
	private String zuoweifenlei;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
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

}
