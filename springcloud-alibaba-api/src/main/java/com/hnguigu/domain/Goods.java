package com.hnguigu.domain;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Goods implements Serializable {

    // 序列化版本唯一编号
    // 结论：一定要将该常量显示写出
    private static final long serialVersionUID = -1190459634949735874L;

    private Integer id;
    private String name;
    private Double price;

}
