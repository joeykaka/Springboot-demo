package com.example.springbootmongodb.dao;

import com.example.springbootmongodb.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/16 0016 10:43
 * @version:1.0
 */
@Component
public interface UserDao {
    /**
     * 查询所有用户
     * @return: java.util.List<com.example.springbootmongodb.entity.User>
     * @auther: jiangyin@vs.com
     * @date: 2018/11/16 0016 10:43
     */
    public List<User> findAll();

    /**
     * 保存用户
     * @param user
     * @auther: jiangyin@vs.com
     * @date: 2018/11/16 0016 10:44
     */
    public void save(User user);


    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return: com.example.springbootmongodb.entity.User
     * @auther: jiangyin@vs.com
     * @date: 2018/11/16 0016 10:46
     */
    public User findOne(String username);

    /**
     * 更新用户
     * @param user
     * @return: void
     * @auther: jiangyin@vs.com
     * @date: 2018/11/16 0016 10:47
     */
    public void Update(User user);

    /**
     * 删除用户
     * @param user
     * @return: void
     * @auther: jiangyin@vs.com
     * @date: 2018/11/16 0016 10:47
     */
    public void delete(User user);
}
