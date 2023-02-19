package com.hacatac.service;

import com.hacatac.entity.User;

public interface UserService {
    User findByUsername(String username);
    User saveUser(User user);
}
