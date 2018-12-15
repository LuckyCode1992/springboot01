package com.hxl.hxlspringboot01.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hxl.hxlspringboot01.entity.Account;
import com.hxl.hxlspringboot01.mapper.AccountMapper;
import com.hxl.hxlspringboot01.mapper.Mapper;
import com.hxl.hxlspringboot01.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    public Account selectByName(String name) {

        return null;
    }
}
