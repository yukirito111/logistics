package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslAccountUpdateMapper;
import com.yuantu.entity.finance.MeslAccountUpdate;
import com.yuantu.service.finance.UpdateAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAccountImpl implements UpdateAccount {
    @Autowired
    MeslAccountUpdateMapper meslAccountUpdateMapper;
    @Override
    public void updateAccount(MeslAccountUpdate meslAccountUpdate) {
        meslAccountUpdateMapper.updateAccount(meslAccountUpdate);
    }
}
