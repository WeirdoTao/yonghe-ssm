/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Door
 * Author:   16701
 * Date:     2020/9/19 18:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tedu.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 16701
 * @create 2020/9/19
 * @since 1.0.0
 */
/*
用于封装门店信息的实体类
 */
public class Door {
private Integer id;
private String name;
private String tel;
private String addr;
//提供对应的get/set方法

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    //提供toString方法

    @Override
    public String toString() {
        return "Door{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}