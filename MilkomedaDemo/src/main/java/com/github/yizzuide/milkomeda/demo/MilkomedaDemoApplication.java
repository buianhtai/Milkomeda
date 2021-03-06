package com.github.yizzuide.milkomeda.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MilkomedaDemoApplication
 *
 * @author yizzuide
 * Create at 2019/03/30 19:04
 */
@EnableMilkomeda
@MapperScan(basePackages = "com.github.yizzuide.milkomeda.demo.*.mapper")
@SpringBootApplication
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class MilkomedaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MilkomedaDemoApplication.class, args);
    }
}
