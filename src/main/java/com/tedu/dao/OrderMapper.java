package com.tedu.dao;

import com.tedu.pojo.Order;

import java.util.List;

/**
订单模块的Dao接口
 */
public interface OrderMapper {
    /**1.查询所有订单信息 */
    List<Order> findAll();

    /**2.根据id删除订单信息 */
     void deleteById(Integer id);

    /**3.新增订单信息 */
    void add(Order order);

    /**4.根据id查询订单信息 */
    Order findById(Integer id);

    /**5.根据ID，更新订单信息 */
    void updateById(Order order);
}
