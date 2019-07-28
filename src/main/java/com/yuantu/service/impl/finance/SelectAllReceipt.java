package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslReceiptMapper;
import com.yuantu.entity.finance.MeslReceipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectAllReceipt implements com.yuantu.service.finance.SelectAllReceipt {
    @Autowired
    MeslReceiptMapper meslReceiptMapper;

    @Override
    public List<MeslReceipt> selectAllReceipt() {
        List<MeslReceipt> list = meslReceiptMapper.selectAllReceipt();
        return list;
    }
}
