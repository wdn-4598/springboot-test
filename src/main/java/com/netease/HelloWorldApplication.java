package com.netease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 主程序启动类
// 该类中使用了一个组合注解 @SpringBootApplication，用来开启 Spring Boot 的自动配置
// 另外该启动类中包含一个 main() 方法，用来启动该项目。
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}

// 注意：Spring Boot 内部集成了 Tomcat，不需要人为手动配置 Tomcat，
// 开发者只需要关注具体的业务逻辑即可。