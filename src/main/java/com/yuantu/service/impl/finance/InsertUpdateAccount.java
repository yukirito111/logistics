package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslAccountUpdateMapper;
import com.yuantu.entity.finance.MeslAccountUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUpdateAccount implements com.yuantu.service.finance.InsertUpdateAccount {
    @Autowired
    MeslAccountUpdateMapper meslAccountUpdateMapper;
    @Override
    public void insertupdateAccount() {
        MeslAccountUpdate meslAccountUpdate = new MeslAccountUpdate();
        meslAccountUpdate.setUpdateDept("部门号");
        meslAccountUpdate.setUpdatePersonnel("人员");
        meslAccountUpdate.setUpdateTrucks("车辆");
        meslAccountUpdate.setUpdateStock("库存");
        meslAccountUpdate.setUpdateAccountName("帐户名");
        meslAccountUpdate.setUpdateAccountMoney("金额");
        meslAccountUpdateMapper.insertAccount(meslAccountUpdate);
    }
}
