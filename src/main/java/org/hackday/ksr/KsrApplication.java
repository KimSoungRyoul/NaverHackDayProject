package org.hackday.ksr;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KsrApplication {

    public static void main(String[] args) {
        SpringApplication.run(KsrApplication.class, args);
    }
}
