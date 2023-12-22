package com.zach.springmall.dao;

import com.zach.springmall.dto.UserRegisterRequest;
import com.zach.springmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);


}
