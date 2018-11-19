package com.example.springbootmongodb.dao.impl;

import com.example.springbootmongodb.dao.UserDao;
import com.example.springbootmongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/16 0016 10:53
 * @version:1.0
 */
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier(value = "userMongoTemplate")
    MongoTemplate userMongoTemplate;

    @Override
    public List<User> findAll() {
        return userMongoTemplate.findAll(User.class);
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User findOne(String username) {
        return null;
    }

    @Override
    public void Update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
