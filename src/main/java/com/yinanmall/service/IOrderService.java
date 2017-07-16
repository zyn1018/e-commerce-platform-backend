package com.yinanmall.service;

import com.yinanmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by yinan on 2017/7/13.
 */
public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String, String> params);

    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);
}
