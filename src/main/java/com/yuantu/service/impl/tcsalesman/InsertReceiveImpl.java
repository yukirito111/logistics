package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.InsertReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertReceiveImpl implements InsertReceive {
    @Autowired
    MeslReceiveMapper meslReceiveMapper;

    @Override
    public MeslReceive insertReceive(String receiveNumber, String receiveTime, String origin, String receivePlace, String freightBatchNumber, String freight) {
        MeslReceive meslReceive = meslReceiveMapper.insertReceive(receiveNumber, receiveTime, origin, receivePlace, freightBatchNumber, freight);
        return meslReceive;
    }
}
