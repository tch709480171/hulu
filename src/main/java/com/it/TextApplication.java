package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.it.mapper")
@EnableCaching//开启缓存
public class TextApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextApplication.class, args);
    }

}
