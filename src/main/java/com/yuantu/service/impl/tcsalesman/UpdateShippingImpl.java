package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslShippingMapper;
import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.UpdateShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateShippingImpl implements UpdateShipping {
    @Autowired
    MeslShippingMapper meslShippingMapper;

    @Override
    public MeslShipping updateShipping(MeslShipping meslShipping) {
        MeslShipping meslShipping1 = meslShippingMapper.updateShipping(meslShipping);
        return meslShipping1;
    }
}
