package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslPaymentMapper;
import com.yuantu.entity.finance.MeslPayment;
import com.yuantu.service.finance.SelectPaymentByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectPaymentByDateImpl implements SelectPaymentByDate {
    @Autowired
    MeslPaymentMapper meslPaymentMapper;

    @Override
    public MeslPayment selectPaymentByDateByDate(String paymentDate, String paymentType) {
        MeslPayment meslPayment = meslPaymentMapper.selectPaymentByDate(paymentDate, paymentType);
        return meslPayment;
    }
}
