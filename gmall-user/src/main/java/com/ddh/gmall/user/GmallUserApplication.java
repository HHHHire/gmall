package com.ddh.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: ddh
 * @data: 2019/12/17 20:37
 * @description
 **/
@SpringBootApplication
@MapperScan("com.ddh.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
