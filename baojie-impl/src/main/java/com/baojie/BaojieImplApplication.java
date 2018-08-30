package com.baojie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.baojie.mapper")
public class BaojieImplApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BaojieImplApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
