package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslStockMapper;
import com.yuantu.service.tcstoreman.UpdateStockState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStockStateImpl implements UpdateStockState {
    @Autowired
    MeslStockMapper meslStockMapper;
    @Override
    public String updateState(String state, String id) {
        meslStockMapper.updateState(state,id);
        return "出库成功";
    }
}
