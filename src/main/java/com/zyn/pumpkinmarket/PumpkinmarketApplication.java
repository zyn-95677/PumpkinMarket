package com.zyn.pumpkinmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyn.pumpkinmarket.dao")
public class PumpkinmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(PumpkinmarketApplication.class, args);
    }

}
