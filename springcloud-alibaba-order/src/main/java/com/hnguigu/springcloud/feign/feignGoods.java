package com.hnguigu.springcloud.feign;

import com.hnguigu.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "springcloud-alibaba-goods")
public interface feignGoods {

    @GetMapping("/goods/findgoods/{id}")
    public Goods findGoods(@PathVariable(value = "id") Integer id);
}
