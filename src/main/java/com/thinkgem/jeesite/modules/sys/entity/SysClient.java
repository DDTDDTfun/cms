/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 商户表Entity
 * @author ddt
 * @version 2016-07-22
 */
public class SysClient extends DataEntity<SysClient> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	
	public SysClient() {
		super();
	}

	public SysClient(String id){
		super(id);
	}

	@Length(min=0, max=255, message="name长度必须介于 0 和 255 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}