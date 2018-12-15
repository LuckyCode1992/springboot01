package com.hxl.hxlspringboot01.controller;

import com.hxl.hxlspringboot01.entity.Account;
import com.hxl.hxlspringboot01.entity.R;
import com.hxl.hxlspringboot01.impl.AccountServiceImpl;
import com.hxl.hxlspringboot01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController{
    @Autowired
    AccountService accountService;

    @PostMapping("/account/querry")
    public R<Account> querryAccountById(Integer id) {

        Account account = accountService.selectById(id);
        R<Account> r = new R<>();
        r.setCode(0);
        r.setMsg("请求成功");
        r.setData(account);
        return r;
    }
}
