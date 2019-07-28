package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslPayment;

public interface SelectPaymentByDate {
    MeslPayment selectPaymentByDateByDate(String paymentDate, String paymentType);
}
