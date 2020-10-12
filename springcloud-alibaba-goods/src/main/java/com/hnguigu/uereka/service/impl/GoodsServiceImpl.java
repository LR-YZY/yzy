package com.hnguigu.uereka.service.impl;


import com.hnguigu.domain.Goods;
import com.hnguigu.uereka.service.GoodsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Value("${server.port}")
    private Integer port;

    @Override
    public Goods findGoodsById(Integer id) {
        //int a =10/0;
        return new Goods(id, "测试商品,"+port, 15000.00);
    }
}