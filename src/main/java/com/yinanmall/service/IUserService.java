package com.yinanmall.service;

import com.yinanmall.common.ServerResponse;
import com.yinanmall.pojo.User;

/**
 * Created by yinan on 6/11/17.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
