package com.example.springbootmongodb.dao;

import com.example.springbootmongodb.entity.Car;
import com.example.springbootmongodb.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/19 0019 10:11
 * @version:1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CarDaoTest {
    @Autowired
    private CarDao carDao;
    @Autowired
    private UserDao userDao;

    @Test
    public void findAll() {
        List<Car> list = carDao.findAll();
        for (Car m : list) {
            System.out.println(m.toString());
        }
    }

    @Test
    public void find(){
        List<User> list = userDao.findAll();
        for (User m : list) {
            System.out.println(m.toString());
        }
    }
}