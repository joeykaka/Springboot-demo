package com.example.springbootmongodb.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @description: 用户实体
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/16 0016 10:38
 * @version:1.0
 */
@Data
@Document(collection = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    @Id
    private ObjectId id;
    private String username;
    private String password;
}
