package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslPaymentMapper;
import com.yuantu.entity.finance.MeslPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectPaymentByNumber implements com.yuantu.service.finance.SelectPaymentByNumber {
    @Autowired
    MeslPaymentMapper meslPaymentMapper;
    @Override
    public MeslPayment selectPaymentByNumber(String number) {
        MeslPayment meslPayment =  meslPaymentMapper.selectPaymentByNumber(number);
        return meslPayment;
    }
}
