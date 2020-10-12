package com.hnguigu.springcloud.service.impl;


import com.hnguigu.domain.Goods;
import com.hnguigu.domain.Order;
import com.hnguigu.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private com.hnguigu.springcloud.feign.feignGoods feignGoods;


    @Override
    public void addOrder(Order order, Integer goodsId) {
        if (order == null) {
            throw new IllegalArgumentException("");
        }

        if (goodsId == null || goodsId <= 0) {
            throw new IllegalArgumentException("");
        }
       /* String url ="http://spring-cloud-goods/goods/findgoods/" + goodsId;
        Goods goods = restTemplate.getForObject(url, Goods.class);*/
        Goods goods = feignGoods.findGoods(goodsId);
        order.setGoods(goods);
        System.out.println(goods);
        System.out.println(order);
    }
}
