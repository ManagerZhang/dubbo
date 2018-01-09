package com.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangke
 * @date 2018-01-09.
 */
@ImportResource("classpath:config/appcontext-dubbo.xml")
@SpringBootApplication
@MapperScan("com.dubbo.dao")
public class DubboWebApplication {
	/**
	 * 项目启动类
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DubboWebApplication.class,args);
	}
}
