package com.hxl.hxlspringboot01.controller;

import com.hxl.hxlspringboot01.entity.Account;
import com.hxl.hxlspringboot01.entity.R;
import com.hxl.hxlspringboot01.impl.AccountServiceImpl;
import com.hxl.hxlspringboot01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AccountController {
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

    @GetMapping("/account/delete")
    public R<Account> deleteAccountById(Integer id) {
        boolean isSucc = accountService.deleteById(id);
        R<Account> r = new R<>();
        if (isSucc) {
            r.setCode(0);
            r.setMsg("请求成功");
            r.setData(null);
        } else {
            r.setCode(-1);
            r.setMsg("业务执行失败");
            r.setData(null);
        }

        return r;
    }

    @GetMapping("/account/allAcount")
    public R<List<Account>> seletcAcountAll() {
        List<Account> accounts = accountService.selectAll();
        R<List<Account>> r = new R<>();
        r.setCode(0);
        r.setMsg("查询成功");
        r.setData(accounts);
        return r;

    }
    @PostMapping("/account/querryByNameorAge")
    public R<List<Account>> selectByNameOrAge(@RequestBody Account account){
        List<Account> accounts = accountService.selectbyNameOrAge(account);
        R<List<Account>> r = new R<>();
        r.setCode(0);
        r.setMsg("查询成功了");
        r.setData(accounts);
        return r;
    }
}
