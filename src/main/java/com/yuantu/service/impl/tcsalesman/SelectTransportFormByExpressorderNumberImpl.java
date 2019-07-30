package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslTransportFormMapper;
import com.yuantu.entity.tcsalesman.MeslTransportForm;
import com.yuantu.service.tcsalesman.SelectTransportFormByExpressorderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectTransportFormByExpressorderNumberImpl implements SelectTransportFormByExpressorderNumber {
    @Autowired
    MeslTransportFormMapper meslTransportFormMapper;

    @Override
    public MeslTransportForm selectTransportFormByExpressorderNumber(String expressorderNumber) {
        MeslTransportForm meslTransportForm = meslTransportFormMapper.selectTransportFormByExpressorderNumber(expressorderNumber);
        return meslTransportForm;
    }
}
