package com.example.springbootmongodb.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @description:
 * @Auther: jiangyin@vs.com
 * @Date: 2018/11/19 0019 10:15
 * @version:1.0
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.user")
public class UserMongoConfig extends AbstractMongoConfig {

    @Primary
    @Override
    public @Bean(name = "userMongoTemplate") MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
