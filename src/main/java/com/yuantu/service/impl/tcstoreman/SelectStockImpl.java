package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslStockMapper;
import com.yuantu.entity.tcstoreman.MeslStock;
import com.yuantu.service.tcstoreman.SelectStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectStockImpl implements SelectStock {
    @Autowired
    MeslStockMapper meslStockMapper;

    @Override
    public List<MeslStock> selectStock(String state) {
        List<MeslStock> list = meslStockMapper.selectStock(state);
        return list;
    }
}
