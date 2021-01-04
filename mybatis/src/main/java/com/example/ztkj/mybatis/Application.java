package com.example.ztkj.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/ztkj/mybatis/mapper") //解决"Field stuService in XXX required a bean of type ‘XXX.XXService’ that could not be found.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
