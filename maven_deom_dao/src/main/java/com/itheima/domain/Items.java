package com.itheima.domain;



import lombok.Data;

import java.util.Date;

@Data
public class Items {
    private int id;
    private String  name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;

}
