package com.store.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/store/product/dao")
public class StoreProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreProductApplication.class, args);
    }

}
