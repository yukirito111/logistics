package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslPayment;

import java.util.List;

public interface SelectPaymentByPaymentType {
    List<MeslPayment> selectPaymentByPaymentType(String paymentType);
}
