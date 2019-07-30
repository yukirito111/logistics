package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslLogisticsMapper;
import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.dao.tcsalesman.MeslTransportFormMapper;
import com.yuantu.entity.tcsalesman.MeslLogistics;
import com.yuantu.entity.tcsalesman.MeslTransportForm;
import com.yuantu.service.tcsalesman.InsertLogistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertLogisticsImpl implements InsertLogistics {
    @Autowired
    MeslLogisticsMapper meslLogisticsMapper;
    @Autowired
    MeslTransportFormMapper meslTransportFormMapper;
    @Autowired
    MeslReceiveMapper meslReceiveMapper;

    @Override
    public void insertLogistics(MeslLogistics meslLogistics, String expressorderNumber) {
        List<MeslTransportForm> list = meslTransportFormMapper.selectTransportForm();
        for (MeslTransportForm meslTransportForm : list
        ) {
            String transportNumber = meslTransportForm.getTransportNumber();
            meslLogistics.setTransportNumber(transportNumber);
            meslLogistics.setHistorical(meslReceiveMapper.selectReceiveByExpressorderNumber(expressorderNumber).getReceivePlace());
            meslLogisticsMapper.insertLogistics(meslLogistics);
        }

    }
}
