package com.zr.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.zr.demo.dao.UserDao;
import com.zr.demo.service.UserService;
import com.zr.model.User;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired  
	    private UserDao userDao; 
	 @Autowired
	    private RedisTemplate redisTemplate;
	    
	 @Override
	    public User selectUserById(Integer userId) {
	        return userDao.selectUserById(userId);  
	    }
	 
	 @Override
		public List<User> findAllUsers() {
			// TODO Auto-generated method stub
			//定义key 和 即将要操作的redis数据
	        String key = "users";
	        ValueOperations<String, List<User>> operations = redisTemplate.opsForValue();
	        //判断redis是否存在key
	        boolean hasKey = redisTemplate.hasKey(key);
	        if (hasKey) {
	        	List<User> users = operations.get(key);
	 
	            System.out.println("是从redis里面取的数据");
	            return users;
	        }
	        List<User> users = userDao.selectAllUsers();
	        operations.set(key, users);
			return users;
		}
}
