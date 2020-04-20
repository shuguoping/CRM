package com.shu.crm.entity;

import lombok.Data;

import java.util.Date;

/**
 * 订单实体
 *
 * @author Administrator
 */
@Data
public class Order {

    private Integer id; // 编号
    private Customer customer; // 所属客户
    private String orderNo; // 订单号
    private Date orderDate; // 订购日期
    // 送货地址

    private String address;
    // 状态 0 未回款 1 已回款
    private Integer state;


}
