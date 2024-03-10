package com.lin.kabu_demo;

import com.lin.kabu_demo.servers.BootNettyServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class KabuDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KabuDemoApplication.class, args);
    }

    @Async
    @Override
    public void run(String... args) throws Exception {
        /*
          使用异步注解方式启动netty服务端服务
          TODO 后续配置线程池
         */
        System.out.println("启动"+Thread.currentThread().getName());
        new BootNettyServer().bind(8888);
    }



}
