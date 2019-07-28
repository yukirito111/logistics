package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslReceiptMapper;
import com.yuantu.entity.finance.MeslReceipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectReceiptByDate implements com.yuantu.service.finance.SelectReceiptByDate {
    @Autowired
    MeslReceiptMapper meslReceiptMapper;
    @Override
    public MeslReceipt selectReceiptByDate(String receiptDate) {
        MeslReceipt meslReceipt = meslReceiptMapper.selectReceiptByDate(receiptDate);
        return meslReceipt;
    }
}
