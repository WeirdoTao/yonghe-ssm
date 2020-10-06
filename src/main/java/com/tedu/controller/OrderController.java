package com.tedu.controller;


import com.tedu.dao.DoorMapper;
import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈测试〉<br>
 * 〈@Controller:标识当前类属于controller层
 * 标识当前类的实例的创建由spring容器负责〉
 *
 * @author atao
 * @create 2020/9/19
 * @since 1.0.0
 */
@Controller
public class OrderController {
    /**@Autowired:自动装配，根据当前变量的类型（OrderMapper）到spring容器中，
     * 获取该接口对应的子类实例，将接口的子类实例赋值给orderMapper
     * */
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DoorMapper doorMapper;

    /**1.查询所有订单信息*/
    @RequestMapping("/orderList")
    public String orderList(Model model){
        //D调用OrderMapper的findAll方法，查询所有的订单信息
        List<Order>list=orderMapper.findAll();
        //将所有订单信息存入Model带到jsp显示
        model.addAttribute("list",list);
        //查询所有门店信息。将所有门店信息存入Model中
        List<Door>dList =doorMapper.findAll();
        model.addAttribute("dList",dList);
        //跳转到订单列表
        return "order_list";
    }

    /**2.根据id删除订单信息*/
@RequestMapping("/orderDelete")
    public String orderDelete(Integer id){
    //调用OrderMapper中的根据id删除订单信息的方法
    orderMapper.deleteById(id);
    //删除完，更新订单信息后 ，跳转到订单列表页面(转发 查询到所有订单的方法，显示最新的订单信息)
        return "forward:/orderList";
    }

    /**3.查询所有门店信息*/
    @RequestMapping("/toOrderAdd")
    public String toOrderAdd(Model model) {
        //查询所有门店信息。将所有门店信息存入Model中
        List<Door>dList =doorMapper.findAll();
        model.addAttribute("dList",dList);
        //跳转到订单新增页面
       return "order_add";
    }

    /**3.添加订单信息*/
    @RequestMapping("/orderAdd")
    public String orderAdd(Order order) {
    //调用OrderMapper的新增方法，新增一条信息
        orderMapper.add(order);
//        更新订单信息后 ，跳转到订单列表页面(转发 查询到所有订单的方法，显示最新的订单信息)
        return "forward:orderList";
    }

    /**4.根据id查询订单信息*/
    @RequestMapping("/orderInfo")
    public String orderInfo(Integer id,Model model){
        //将订单信息存入到model中
        Order order=orderMapper.findById(id);
        model.addAttribute("order",order);
        //查询所有门店信息。将所有门店信息存入Model中
        List<Door>dList =doorMapper.findAll();
        model.addAttribute("dList",dList);
        //跳转到订单修改页面，回显原有的订单信息
        return "order_update";
    }

    /**5.根据id修改订单信息*/
    @RequestMapping("/orderUpdate")
    public String orderUpdate(Order order){
        //调用OrderMapper的修改订单的方法，根据Id修改订单信息
        orderMapper.updateById(order);
        //更新订单信息后，跳转到查询所有订单的方法，显示最新的订单信息
        return "forward:/orderList";
    }

}