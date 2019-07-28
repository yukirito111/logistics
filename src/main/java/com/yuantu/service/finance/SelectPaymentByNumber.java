package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslPayment;

import java.util.List;

public interface SelectPaymentByNumber {
    MeslPayment selectPaymentByNumber(String number);
}
