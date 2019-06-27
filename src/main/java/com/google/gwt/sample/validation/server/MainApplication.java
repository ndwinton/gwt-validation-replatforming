package com.google.gwt.sample.validation.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistration() {
        ServletRegistrationBean bean = new ServletRegistrationBean(
                new GreetingServiceImpl(), "/validation/greet");
        //bean.setLoadOnStartup(1);
        return bean;
    }
}
