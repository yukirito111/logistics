package com.yuantu.service.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;

public interface SelectStorehouseByExpressorderNumber {
    MeslIntoStorehouse selectStorehouseByExpressorderNumber(String expressorderNumber);
}
