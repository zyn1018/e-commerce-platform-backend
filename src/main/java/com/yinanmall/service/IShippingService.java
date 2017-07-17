package com.yinanmall.service;

import com.github.pagehelper.PageInfo;
import com.yinanmall.common.ServerResponse;
import com.yinanmall.pojo.Shipping;

/**
 * Created by yinan on 2017/6/27.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
