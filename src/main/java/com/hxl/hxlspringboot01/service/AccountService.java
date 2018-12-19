package com.hxl.hxlspringboot01.service;

import com.baomidou.mybatisplus.service.IService;
import com.hxl.hxlspringboot01.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService extends IService<Account> {


    List<Account> selectAll();

    List<Account> selectbyNameOrAge(Account account);

}
