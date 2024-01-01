package com.zach.springmall.service;

import com.zach.springmall.dto.UserLoginRequest;
import com.zach.springmall.dto.UserRegisterRequest;
import com.zach.springmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
