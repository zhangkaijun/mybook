package com.my.book;

import javax.xml.ws.Endpoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Sample WAR application
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.my.book.*")
@ComponentScan({"com.my.book.*"})
public class SampleWarApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) throws Exception{
		//System.out.println(SampleWarApplication.class.getResource("/").toString());
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(SampleWarApplication.class, args);
	}
	
}
