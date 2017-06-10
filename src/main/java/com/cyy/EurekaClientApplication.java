package com.cyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 * 
 * eureka 客户端，对外提供服务，需要注册到注册中心。
 * 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EurekaClientApplication {
	
    public static void main( String[] args ){
    	
    	SpringApplication.run(EurekaClientApplication.class, args);
    	
    }

}
