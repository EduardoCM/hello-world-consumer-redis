package com.codigorupestre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;

@SpringBootApplication
@EnableRedisDocumentRepositories(basePackages = "com.codigorupestre.documents")
public class HelloWorldConsumerRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldConsumerRedisApplication.class, args);
	}

}
