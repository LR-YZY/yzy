package com.hnguigu.uereka.controller;


import com.hnguigu.domain.Goods;
import com.hnguigu.uereka.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class goodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("findgoods/{id}")
    public Goods findGoods(@PathVariable(value = "id") Integer id){
        return goodsService.findGoodsById(id);
    }
}
