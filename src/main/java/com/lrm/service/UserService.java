package com.lrm.service;

import com.lrm.po.User;

/**
 * Created by 黄秋平 on 2019.06.18
 */
public interface UserService {

    User checkUser(String username, String password);
}
