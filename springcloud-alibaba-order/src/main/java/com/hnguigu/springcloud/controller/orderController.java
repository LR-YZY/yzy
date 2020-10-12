package com.hnguigu.springcloud.controller;

import com.hnguigu.domain.Order;
import com.hnguigu.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RefreshScope
public class orderController {

    @Autowired
    private OrderService orderService;

    @Value("${user.age}")
    private Integer name;

    @PostMapping("/add/{id}")
    public String  addorder(@RequestBody Order order,@PathVariable Integer id){
        orderService.addOrder(order,id);
        int i = name + 1;
        System.out.println(name);
        //int a = 10/0;
        return "我是你爹";
    }
}
