/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.sys.entity.SysClient;
import com.thinkgem.jeesite.modules.sys.dao.SysClientDao;

/**
 * 商户表Service
 * @author ddt
 * @version 2016-07-22
 */
@Service
@Transactional(readOnly = true)
public class SysClientService extends CrudService<SysClientDao, SysClient> {

	public SysClient get(String id) {
		return super.get(id);
	}
	
	public List<SysClient> findList(SysClient sysClient) {
		return super.findList(sysClient);
	}
	
	public Page<SysClient> findPage(Page<SysClient> page, SysClient sysClient) {
		return super.findPage(page, sysClient);
	}
	
	@Transactional(readOnly = false)
	public void save(SysClient sysClient) {
		super.save(sysClient);
	}
	
	@Transactional(readOnly = false)
	public void delete(SysClient sysClient) {
		super.delete(sysClient);
	}
	
}