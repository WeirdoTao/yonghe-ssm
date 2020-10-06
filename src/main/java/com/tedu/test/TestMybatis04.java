package com.tedu.test;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;
import org.junit.Test;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

public class TestMybatis04 {
	private  static SqlSession session=null;
	//负责获取mybatic的核心配置文件以及获取SqlSessionFactory工厂对象和获取一个SqlSession对象
	static {
		//对SqlSession进行初始化
		try {
			// 1.读取mybatis的核心配置文件(mybatis-config.xml)
			InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config2.xml");
			// 2.通过配置信息获取一个SqlSessionFactory工厂对象
			SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(in);
			// 3.通过工厂获取一个SqlSession对象
			session = fac.openSession(true);//true表示自动提交事务
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	//==================================Mapper接口开发============================
	/**
	 * 1.创建一个mapper接口，要求接口的全限定类名和mapper文件的namespace值相同
	 * 2.mapper文件中的每条SQL语句，在mapper接口中添加一个对应的方法，
	 *      并且接口中的方法名和SQL标签的id值相同
	 * 3.mapper接口中方法上的参数类型和mapper文件中SQL语句接受的参数类型要相同
	 * 4.接口中方法的返回值类型和SQL标签上的resultType即返回值类型也要相同
	 * （如果方法返回是是一个集合，例如List<Door>，在resultType中只需要指定集合中的泛型即Emp类型
	 */

	/**
	 * mapper接口测试1：查询所有员工信息
	 */
	@Test
	public void testFindAll() {
		//1.获取EmpMapper接口的子类对象/实例
		/**
		 * 将EmpMapper接口的字节码对象传给getMapper方法，框架底层会根据EmpMapper接口
		 * 的字节码对象，为接口提供一个实现类/子类，在根据实现类/子类创建一个实例并返回
		 */
		DoorMapper mapper=session.getMapper(DoorMapper.class);

		//2.调用findAll方法查询所有员工信息
		/**
		 * findAll方法底层如何实现：findAll方法底层会根据[接口的全限定类名+当前方法的名字]
		 * 找到要执行SQL语句，执行SQL语句，返回执行的结果即可！
		 *   接口的全限定类名==namespace
		 *   当前方法的名字==id值
		 */
		List<Door>list=mapper.findAll();
		for (Door door : list) {
			System.out.println(door);
		}

	}


	/**
	 * mapper接口测试1：新增员工信息
	 */
//	@Test
//	public void testInsert() {
//		//将SQL 语句中的参数封装在Emp对象中
//		Door doorp=new Door();
//		door.setName("阿涛");
//		door.setJob("经理");
//		emp.setSalary(9000000.0);
//
//		//获取EmpMapper接口的子类实例
//		DoorMapper mapper=session.getMapper(DoorMapper.class);
//		int rows=mapper.insert(door);
//		System.out.println("影响行数："+rows);
//
//
//
//
//	}
}
