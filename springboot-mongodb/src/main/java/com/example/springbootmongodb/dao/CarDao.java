package com.example.springbootmongodb.dao;

import com.example.springbootmongodb.entity.Car;

import java.util.List;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/19 0019 10:08
 * @version:1.0
 */

public interface CarDao {
    public List<Car> findAll();
}
