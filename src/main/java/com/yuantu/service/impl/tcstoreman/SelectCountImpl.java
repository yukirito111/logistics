package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslStockMapper;
import com.yuantu.service.tcstoreman.SelectCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectCountImpl implements SelectCount {
    @Autowired
    MeslStockMapper meslStockMapper;

    @Override
    public long selectCount(String state) {
        long count = meslStockMapper.selectCount(state);
        return count;
    }
}
