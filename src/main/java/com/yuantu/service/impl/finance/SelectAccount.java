package com.yuantu.service.impl.finance;


import com.yuantu.dao.finance.MeslAccountMapper;
import com.yuantu.entity.finance.MeslAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAccount implements com.yuantu.service.finance.SelectAccount{
    @Autowired
    MeslAccountMapper meslAccountMapper;
    @Override
    public MeslAccount selectAccount(Integer id) {
      MeslAccount  meslAccount = meslAccountMapper.selectAccount(id);
        return meslAccount;
    }
}
