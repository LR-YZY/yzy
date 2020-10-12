package com.hnguigu.springcloud.service;

import com.hnguigu.domain.Order;

public interface OrderService {
    

    void addOrder(Order order, Integer goodsId);

}
