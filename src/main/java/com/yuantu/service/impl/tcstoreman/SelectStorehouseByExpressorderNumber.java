package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslIntoStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectStorehouseByExpressorderNumber implements com.yuantu.service.tcstoreman.SelectStorehouseByExpressorderNumber {
    @Autowired
    MeslIntoStorehouseMapper meslIntoStorehouseMapper;
    @Override
    public MeslIntoStorehouse selectStorehouseByExpressorderNumber(String expressorderNumber) {
        MeslIntoStorehouse meslIntoStorehouse =meslIntoStorehouseMapper.selectStorehouseByExpressorderNumber(expressorderNumber);
        return meslIntoStorehouse;
    }
}
