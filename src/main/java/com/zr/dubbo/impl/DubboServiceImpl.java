package com.zr.dubbo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zr.demo.dao.UserDao;
import com.zr.dubbo.DubboService;
import com.zr.model.User;

@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService{

    @Autowired  
    private UserDao userDao; 
	@Override
	public List<User> A() {
		return userDao.selectAllUsers();
	}

}
