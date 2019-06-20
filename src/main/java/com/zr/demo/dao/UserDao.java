package com.zr.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zr.model.User;

@Mapper
public interface UserDao {
	/**
	 * 	根据id来查询用户信息
	 * @param userId
	 * @return
	 */
	 public User selectUserById(Integer userId); 
	 public List<User> selectAllUsers();
}
