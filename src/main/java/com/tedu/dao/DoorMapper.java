package com.tedu.dao;

import com.tedu.pojo.Door;

import java.util.List;

/**
门店模块的Dao接口
 */
public interface DoorMapper {
    /**1.查询所有门店信息 */
    List<Door> findAll();

    /**2.根据id删除门店信息 */
     void deleteById(Integer id);

    /**3.新增门店信息 */
    void add(Door door);

    /**4.根据id查询门店信息 */
    Door findById(Integer id);

    /**5.根据ID，更新门店信息 */
    void updateById(Door door);
}
