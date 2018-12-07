package com.hxl.hxlspringboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * controller 代表网络层 接收请求的
 * entity 数据库表对应的实体类 一般表有什么字段
 * entity就有什么属性 mapper对应数据库访问层 定义操作数据库的增删改查 service 就是业务逻辑层
 * 请求->controller(参数用entity包装)->service(entity包装参数)->mapper(参数用entity包装)->service->controller->响应数据
 */
@SpringBootApplication
public class Hxlspringboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Hxlspringboot01Application.class, args);
    }
}
