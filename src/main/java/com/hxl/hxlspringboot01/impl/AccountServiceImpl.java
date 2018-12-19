package com.hxl.hxlspringboot01.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hxl.hxlspringboot01.entity.Account;
import com.hxl.hxlspringboot01.mapper.AccountMapper;
import com.hxl.hxlspringboot01.mapper.Mapper;
import com.hxl.hxlspringboot01.service.AccountService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public List<Account> selectAll(){
        return baseMapper.selectAll();
    }

    @Override
    public List<Account> selectbyNameOrAge(Account account) {
        return baseMapper.selectbyNameOrAge(account);
    }
}
