package com.credit.service.impl;

import com.credit.model.User;
import com.credit.service.*;
import com.credit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by leo on 15/8/2.
 */
@Service
public class UserServiceImpl implements com.credit.service.UserService {

    @Autowired
    UserDao userDao;


    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
