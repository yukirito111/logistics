package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslPaymentMapper;
import com.yuantu.entity.finance.MeslPayment;
import com.yuantu.service.finance.InsertPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertPaymentImpl implements InsertPayment {
    @Autowired
    MeslPaymentMapper meslPaymentMapper;

    @Override
    public String insertPayment(MeslPayment meslPayment) {
        meslPaymentMapper.insertPayment(meslPayment);
        return "添加成功";
    }
}
