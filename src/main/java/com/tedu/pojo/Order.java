/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Order
 * Author:   16701
 * Date:     2020/9/27 17:17
 * Description: 订单对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tedu.pojo;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈订单对象〉
 *
 * @author 16701
 * @create 2020/9/27
 * @since 1.0.0
 */
public class Order {
    /**编号*/
    private Integer id;
    /**所属门店编号*/
    private Integer doorId;
    /**下单号*/
    private String orderNo;
    /**订单类型*/
    private String orderType;
    /**用餐人数*/
    private Integer pnum;
    /**收银员*/
    private String cashier;
    /**下单时间*/
    private Date orderTime;
    /**支付时间*/
    private Date payTime;
    /**支付方式*/
    private String payType;
    /**金额*/
    private Double price;


    /**提供get和set方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoorId() {
        return doorId;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", doorId=" + doorId +
                ", orderNo='" + orderNo + '\'' +
                ", orderType='" + orderType + '\'' +
                ", pnum=" + pnum +
                ", cashier='" + cashier + '\'' +
                ", orderTime=" + orderTime +
                ", payTime=" + payTime +
                ", payType='" + payType + '\'' +
                ", price=" + price +
                '}';
    }
}