package com.zach.springmall.service.impl;

import com.zach.springmall.dao.UserDAO;
import com.zach.springmall.dto.UserRegisterRequest;
import com.zach.springmall.model.User;
import com.zach.springmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserById(Integer userId) {
        return userDAO.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDAO.createUser(userRegisterRequest);
    }
}
