package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslShippingMapper;
import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.SelectShippingByNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectShippingByNumImpl implements SelectShippingByNum {
    @Autowired
    MeslShippingMapper meslShippingMapper;

    @Override
    public MeslShipping selectShippingByNum(String expressorderNumber) {
        MeslShipping meslShipping = meslShippingMapper.selectShippingByNum(expressorderNumber);
        return meslShipping;
    }
}
