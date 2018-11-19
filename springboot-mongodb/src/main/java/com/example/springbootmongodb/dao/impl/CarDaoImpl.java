package com.example.springbootmongodb.dao.impl;

import com.example.springbootmongodb.dao.CarDao;
import com.example.springbootmongodb.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/19 0019 10:09
 * @version:1.0
 */
@Component
public class CarDaoImpl implements CarDao {
    @Autowired
    @Qualifier(value = "carMongoTemplate")
    private MongoTemplate carMongoTemplate;

    @Override
    public List<Car> findAll() {
        return carMongoTemplate.findAll(Car.class);
    }

    public void finsssd(){}
}
