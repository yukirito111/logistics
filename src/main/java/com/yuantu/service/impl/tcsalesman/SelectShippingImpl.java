package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslShippingMapper;
import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.SelectShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SelectShippingImpl implements SelectShipping {
    @Autowired
    MeslShippingMapper meslShippingMapper;
    @Override
    public List<MeslShipping> selectShipping() {
        List<MeslShipping> list = meslShippingMapper.selectShipping();
        return list;
    }
}
