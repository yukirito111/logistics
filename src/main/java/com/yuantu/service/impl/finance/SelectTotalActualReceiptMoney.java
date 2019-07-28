package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslReceiptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectTotalActualReceiptMoney implements com.yuantu.service.finance.SelectTotalActualReceiptMoney {
    @Autowired
    MeslReceiptMapper meslReceiptMapper;

    @Override
    public double selectTotalActualReceiptMoney() {
        double total = meslReceiptMapper.total();
        return total;
    }
}
