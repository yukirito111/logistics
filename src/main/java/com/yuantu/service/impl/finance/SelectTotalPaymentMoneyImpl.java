package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslPaymentMapper;
import com.yuantu.service.finance.SelectTotalPaymentMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectTotalPaymentMoneyImpl implements SelectTotalPaymentMoney {
    @Autowired
    MeslPaymentMapper meslPaymentMapper;

    @Override
    public double selectTotalPaymentMoney(String paymentType) {
        double sum = meslPaymentMapper.total(paymentType);
        return sum;
    }
}
