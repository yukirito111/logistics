package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslReceipt;

public interface SelectReceiptByDate {
    MeslReceipt selectReceiptByDate(String date);
}
