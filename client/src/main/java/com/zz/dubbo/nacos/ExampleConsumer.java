package com.zz.dubbo.nacos;

import com.zz.contract.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.io.IOException;

@EnableDubbo
@PropertySource(value = "classpath:/config/consumer.properties")
public class ExampleConsumer {

    @Reference(version = "${demo.service.version}")
    private IUserService demoService;



    @PostConstruct
    public void init() {
        for (int i = 0; i < 15; i++) {
            System.out.println(demoService.getUserInfo("zzcode"+i));
        }
    }

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ExampleConsumer.class);
        context.refresh();
        context.close();
    }
}
