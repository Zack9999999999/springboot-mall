package com.zach.springmall.dao;

import com.zach.springmall.dto.UserRegisterRequest;
import com.zach.springmall.model.User;

public interface UserDAO {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
