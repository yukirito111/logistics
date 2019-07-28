package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslAccountMapper;
import com.yuantu.entity.finance.MeslAccount;
import com.yuantu.service.finance.InsertAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertAccountImpl implements InsertAccount {
    @Autowired
    MeslAccountMapper meslAccountMapper;
    @Override
    public void insertAccount() {
        MeslAccount meslAccount = new MeslAccount();
        meslAccount.setDept("部门号");
        meslAccount.setPersonnel("人员");
        meslAccount.setTrucks("车辆");
        meslAccount.setStock("库存");
        meslAccount.setAccountName("帐户名");
        meslAccount.setAccountMoney("金额");
        meslAccountMapper.insertAccount(meslAccount);

    }
}
