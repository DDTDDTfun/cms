/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.sys.entity.SysClient;

/**
 * 商户表DAO接口
 * @author ddt
 * @version 2016-07-22
 */
@MyBatisDao
public interface SysClientDao extends CrudDao<SysClient> {
	
}