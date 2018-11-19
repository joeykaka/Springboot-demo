package com.example.springbootmongodb.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/19 0019 10:06
 * @version:1.0
 */
@Data
@Document(collection = "car")
public class Car implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    @Id
    private ObjectId id;
    private String color;
    private String weight;
}
