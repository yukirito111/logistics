package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslLogisticsMapper;
import com.yuantu.entity.tcsalesman.MeslLogistics;
import com.yuantu.service.tcsalesman.SelectLogisticsByNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectLogisticsByNumImpl implements SelectLogisticsByNum {
    @Autowired
    MeslLogisticsMapper meslLogisticsMapper;

    @Override
    public MeslLogistics selectLogisticsByNum(String logisticsNumber) {
        MeslLogistics meslLogistics = meslLogisticsMapper.selectLogisticsByLogisticsNumber(logisticsNumber);
        return meslLogistics;
    }
}
