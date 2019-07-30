package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.SelectReceiveByNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectReceiveByNumImpl implements SelectReceiveByNum {
    @Autowired
    MeslReceiveMapper meslReceiveMapper;

    @Override
    public MeslReceive selectReceiveByNum(String expressorderNumber) {
        MeslReceive meslReceive = meslReceiveMapper.selectReceiveByExpressorderNumber(expressorderNumber);
        return meslReceive;
    }
}
