package com.example.demo;

import com.example.demo.mvc.mapper.BaseDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAsync
@MapperScan(basePackageClasses = BaseDao.class)
public class DemoApplication {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();}
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

