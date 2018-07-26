package com.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.user.service.IUserService;
import com.user.proj.User;
import com.user.dao.UserMapper;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	public User getUserById(int userId) {
		
		return this.userMapper.selectByPrimaryKey(userId);
		
	}

}
