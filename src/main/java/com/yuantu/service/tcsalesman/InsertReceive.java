package com.yuantu.service.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslReceive;

public interface InsertReceive {
    MeslReceive insertReceive(String receiveNumber,String receiveTime,String origin,String receivePlace,String freightBatchNumber,String freight);
}
