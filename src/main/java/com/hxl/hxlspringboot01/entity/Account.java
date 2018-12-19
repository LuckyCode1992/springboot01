package com.hxl.hxlspringboot01.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//lombok 框架
@Data //注解，自动生成get，set方法 ，重写equal方法和hashcode
@Accessors(chain = true) //@Accessors(chain = true) 代表链式调用 你可以这样写 account.setId(1).setAge(25) 这样一直调下去
@EqualsAndHashCode(callSuper = false) //@EqualsAndHashCode(callSuper = false) 是当前重写的equal和hash方法是否调用super的equal和hash方法
@TableName("account")
@NoArgsConstructor
public class Account {
    @TableId(type = IdType.AUTO)
    @TableField
    private int id;
    private String name;
    private int age;

}
