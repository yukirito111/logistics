package com.yuantu.controller.finance;

import com.yuantu.entity.finance.MeslAccount;
import com.yuantu.entity.finance.MeslAccountUpdate;
import com.yuantu.service.finance.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ShowAccount", method = {RequestMethod.GET, RequestMethod.POST})
public class ShowAccount {
    @Autowired
    SelectAccount selectAccount;
    @Autowired
    InsertAccount insertAccount;
    @Autowired
    SelectUpdateAccount selectUpdateAccount;
    @Autowired
    InsertUpdateAccount insertUpdateAccount;
    @Autowired
    UpdateAccount updateAccount;

    @ResponseBody //期初建账
    @RequestMapping(value = "/showAccount", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslAccount showAccount() {
        Integer id = 11;
        insertAccount.insertAccount();
        MeslAccount meslAccount = selectAccount.selectAccount(11);
        return meslAccount;
    }

    @ResponseBody //显示修改后账户信息
    @RequestMapping(value = "/showUpdateAccount", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslAccountUpdate showUpdateAccount() {
        MeslAccountUpdate mu = selectUpdateAccount.selectUpdateAccount();
        return mu;
    }

    @ResponseBody //设置默认值
    @RequestMapping(value = "/insertAccount", method = {RequestMethod.GET,RequestMethod.POST})
    public void insertAccount() {
        insertUpdateAccount.insertupdateAccount();
    }

    @ResponseBody //修改账户信息
    @RequestMapping(value = "/updateAccount", method = {RequestMethod.GET,RequestMethod.POST})
    public void updateAccount(@RequestBody MeslAccountUpdate meslAccountUpdate) {
        updateAccount.updateAccount(meslAccountUpdate);
    }
}
