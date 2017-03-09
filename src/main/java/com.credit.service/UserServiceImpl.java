package com.credit.service;

import com.alibaba.dubbo.config.annotation.Service;

import net.aimeizi.dubbo.entity.User;
import net.aimeizi.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User save(User user) {
		user.setUserId(++UserIdGenerator.id);
		return user;
	}

}
