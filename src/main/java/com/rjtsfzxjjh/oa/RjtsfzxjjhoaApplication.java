package com.rjtsfzxjjh.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RjtsfzxjjhoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RjtsfzxjjhoaApplication.class, args);
    }
}
