package com.hxl.hxlspringboot01.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hxl.hxlspringboot01.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper extends BaseMapper<Account> {
    List<Account> selectAll();
    List<Account> selectbyNameOrAge(Account account);
}
