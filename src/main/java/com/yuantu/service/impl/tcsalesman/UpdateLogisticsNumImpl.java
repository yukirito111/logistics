package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslLogisticsMapper;
import com.yuantu.service.tcsalesman.UpdateLogisticsNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLogisticsNumImpl implements UpdateLogisticsNum {
    @Autowired
    MeslLogisticsMapper meslLogisticsMapper;

    @Override
    public void updateLogisticsNum(String logisticsNumber, Integer id) {
        meslLogisticsMapper.updateLogisticsNum(logisticsNumber, id);
    }
}
