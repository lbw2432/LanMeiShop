package org.lanmei.admin.impl;

import org.lanmei.admin.dao.mapper.CmsAdminMapper;
import org.lanmei.admin.dao.model.CmsAdmin;
import org.lanmei.admin.service.CmsAdminService;
import org.lanmei.common.BaseService;
import org.lanmei.enumDefine.AdminStatus;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.pool.DruidDataSource;


@Transactional
@Service
public class CmsAdminServiceImpl  extends BaseService implements CmsAdminService{

	private final static Logger logger = LoggerFactory.getLogger("UserServiceImpl.class");	
	{
		logger.debug("UserServiceImpl create bean ......");
	}
	@Autowired
	private CmsAdminMapper adminMapper;
	
	@Autowired
	private DruidDataSource dataSource; 
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactory;
	
	
	
	
	@Override
	public AdminStatus addAdmin(CmsAdmin admin) {
		// TODO Auto-generated method stub
		
		Integer data =  adminMapper.insertNewAdmin(admin);
		
		/*adminMapper.selectAll();*/
	
		if(data == null) {
			
			logger.error("新增账户写入数据库失败");
			return  AdminStatus.ADMIN_CREATE_FAIL;
		}
		else {
		
			logger.error("新增账户写入数据库成功");
			return AdminStatus.ADMIN_CREATE_SUCCESS;
		}
	}
	
}