package com.zmkj.wnlt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@MapperScan("com.zmkj.wnlt.mapper")
//开启事务管理
@EnableTransactionManagement
public class WnltApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WnltApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
//      return super.configure(builder);
		return builder.sources(this.getClass());
	}

}
