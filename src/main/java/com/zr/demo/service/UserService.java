package com.zr.demo.service;

import java.util.List;

import com.zr.model.User;

public interface UserService {
	User selectUserById(Integer userId); 
	List<User> findAllUsers();
}
