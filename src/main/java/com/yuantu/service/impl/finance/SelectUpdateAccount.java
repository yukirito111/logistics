package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslAccountUpdateMapper;
import com.yuantu.entity.finance.MeslAccountUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectUpdateAccount implements com.yuantu.service.finance.SelectUpdateAccount {
    @Autowired
    MeslAccountUpdateMapper meslAccountUpdateMapper;

    @Override
    public MeslAccountUpdate selectUpdateAccount() {
        MeslAccountUpdate meslAccountUpdate = meslAccountUpdateMapper.selectUpdateAccount();
        return meslAccountUpdate;
    }
}
