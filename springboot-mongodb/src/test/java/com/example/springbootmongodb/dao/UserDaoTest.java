package com.example.springbootmongodb.dao;

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
 * @Date: 2018/11/16 0016 10:57
 * @version:1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;


    @Test
    public void findAll() {
        List<User> list = userDao.findAll();
        System.out.println(list.toString());
        for (User user: list) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void save() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}