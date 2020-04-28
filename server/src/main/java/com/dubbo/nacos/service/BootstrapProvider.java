package com.dubbo.nacos.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

@EnableDubbo(scanBasePackages = "com.dubbo.nacos.service")
@PropertySource(value = "classpath:/config/provider.properties")
public class BootstrapProvider {
    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(BootstrapProvider.class);
        context.refresh();

        System.out.println("dubbo服务已经启动");

        System.in.read();
    }

}
