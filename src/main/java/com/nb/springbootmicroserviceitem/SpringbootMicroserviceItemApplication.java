package com.nb.springbootmicroserviceitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class SpringbootMicroserviceItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroserviceItemApplication.class, args);
    }

}
