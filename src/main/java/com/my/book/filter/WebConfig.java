package com.my.book.filter;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author zhangkj
 *
 */
@Configuration
public class WebConfig {
	
	@Bean
	public Filter getLoginFilter() {
		return new LoginFilter();
	}
	
	@Bean
    @Order(Integer.MAX_VALUE)
    public FilterRegistrationBean<Filter> someFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(getLoginFilter());
        registration.addUrlPatterns("/book/*");
        //registration.addInitParameter("paramName", "paramValue");
        registration.setName("sessionFilter");
        return registration;
    }
	
	
	/*@Bean
	public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/mdm/ws/*");
	}*/
	//默认dispatcherServlet
	
}
