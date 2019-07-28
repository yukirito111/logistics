package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslPaymentMapper;
import com.yuantu.entity.finance.MeslPayment;
import com.yuantu.service.finance.SelectPaymentByPaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectPaymentByPaymentByTypeImpl implements SelectPaymentByPaymentType {
    @Autowired
    MeslPaymentMapper meslPaymentMapper;

    @Override
    public List<MeslPayment> selectPaymentByPaymentType(String paymentType) {
        List<MeslPayment> list = meslPaymentMapper.selectPaymentByPaymentType(paymentType);
        return list;
    }
}
