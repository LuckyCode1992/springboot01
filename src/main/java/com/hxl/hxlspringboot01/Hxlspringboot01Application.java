package com.hxl.hxlspringboot01;

import com.hxl.hxlspringboot01.controller.AccountController;
import com.hxl.hxlspringboot01.controller.BaseController;
import com.hxl.hxlspringboot01.entity.Account;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Controller 代表网络层 接收请求的
 * Entity 数据库表对应的实体类 一般表有什么字段
 * entity就有什么属性 mapper对应数据库访问层 定义操作数据库的增删改查 Service 就是业务逻辑层
 * 请求->Controller(参数用entity包装)->Service(entity包装参数)->Mapper(参数用entity包装)->Service->Controller->响应数据
 */
@SpringBootApplication
@MapperScan("com.hxl.hxlspringboot01.mapper")
public class Hxlspringboot01Application {


    public static void main(String[] args) {
        SpringApplication.run(Hxlspringboot01Application.class, args);
    }
}
