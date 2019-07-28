package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.dao.tcsalesman.MeslShippingMapper;
import com.yuantu.entity.courier.MeslMail;
import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.InsertShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertShippingImpl implements InsertShipping {
    @Autowired
    MeslShippingMapper meslShippingMapper;
    @Override
    public MeslShipping insertShipping(MeslShipping meslShipping) {
        MeslShipping ms = meslShippingMapper.insertShipping(meslShipping);
        return ms;
    }
}
