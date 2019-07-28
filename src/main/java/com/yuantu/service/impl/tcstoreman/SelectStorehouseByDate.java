package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslIntoStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SelectStorehouseByDate implements com.yuantu.service.tcstoreman.SelectStorehouseByDate {
    @Autowired
    MeslIntoStorehouseMapper meslIntoStorehouseMapper;
    @Override
    public MeslIntoStorehouse selectStorehouseByDate(Date startDate,Date endDate) {
        MeslIntoStorehouse meslIntoStorehouse = meslIntoStorehouseMapper.selectStorehouseByDate(startDate,endDate);
        return meslIntoStorehouse;
    }
}
