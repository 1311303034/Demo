package com.zr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Hello world!
 *
 */
//@EnableScheduling   // 启用间隔调度
@SpringBootApplication
public class ApplicationMain extends SpringBootServletInitializer{
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(ApplicationMain.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
