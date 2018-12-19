package com.hxl.hxlspringboot01.controller;

import com.hxl.hxlspringboot01.entity.*;
import com.hxl.hxlspringboot01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BaseController {
    @Autowired
    AccountService accountService;


    @PostMapping("/account/insert")
    public R<Account> insert(@RequestBody Account account) {
       boolean isSucc =  accountService.insert(account);
        R<Account> r = new R<>();
        if (isSucc){
            r.setCode(0);
            r.setMsg("请求成功");
        }else {
            r.setCode(-1);
            r.setMsg("业务执行失败");
        }

        return r;
    }

    @RequestMapping("/userInfo1")
    public Entity getEntity() {
        return new Entity(0, "请求成功", new UserInfo("hello", 18, "程序员", "lucky", "123456"));
    }

    /**
     * GET请求的一种，获取url路径的数据
     *
     * @param account
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/userInfo2/{account}/{pwd}", method = RequestMethod.GET)
    public Entity getUserInfoByGet1(@PathVariable("account") String account, @PathVariable("pwd") String pwd) {
        if (account == null || pwd == null) {
            return new Entity(-1, "账户和密码不能为null", null);
        }

        if (account.equals("hello") && pwd.equals("123456")) {
            return new Entity(0, "请求成功", new UserInfo("hello", 18, "程序员", "lucky", "123456"));
        } else {
            return new Entity(1, "账户或密码错误", null);
        }
    }

    /**
     * GET 请求 ?形式
     *
     * @param account
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/userInfo3", method = RequestMethod.GET)
    public Entity getUserInfoByGet2(@RequestParam(value = "account", required = false) String account, @RequestParam(value = "pwd", required = false) String pwd) {
        if (account.equals("") || pwd.equals("")) {
            return new Entity(-1, "账户和密码不能为null", null);
        }
        if (account.equals("hello") && pwd.equals("12345678")) {
            return new Entity(0, "请求成功", new UserInfo("hello", 18, "程序员", "lucky", "12345678"));
        } else {
            return new Entity(1, "账户或密码错误", null);
        }
    }

    /**
     * POST K-V形式
     *
     * @param account
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/userInfo4", method = RequestMethod.POST)
    public Entity getUserInfoByPost1(@RequestParam(value = "account", required = false, defaultValue = "") String account, @RequestParam(value = "pwd", required = false, defaultValue = "") String pwd) {
        if (account.equals("") || pwd.equals("")) {
            return new Entity(-1, "账户和密码不能为null", null);
        }
        if (account.equals("hello") && pwd.equals("123456789")) {
            return new Entity(0, "请求成功", new UserInfo("hello", 18, "程序员", "lucky", "12345678"));
        } else {
            return new Entity(1, "账户或密码错误", null);
        }
    }

    /**
     * POST json格式方式
     *
     * @param loginInfo
     * @return
     */
    @RequestMapping(value = "/userInfo5", method = RequestMethod.POST)
    public Entity getUserInfoByPost2(@RequestBody LoginInfo loginInfo) {

        if (loginInfo.getAccount().equals("hello") && loginInfo.getPwd().equals("123456")) {
            return new Entity(0, "请求成功", new UserInfo("hello", 18, "程序员", "lucky", "12345678"));
        } else {
            return new Entity(1, "账户或密码错误", null);
        }
    }


}
