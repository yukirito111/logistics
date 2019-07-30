package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslStockMapper;
import com.yuantu.service.tcstoreman.SelectCount;
import com.yuantu.service.util.InventoryAlarmUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.yuantu.service.util.InventoryAlarmUtil.inventoryAlarm;

@Service
public class SelectCountImpl implements SelectCount {
    @Autowired
    MeslStockMapper meslStockMapper;
    @Autowired
    SelectCountImpl selectCountImpl;

    @Override
    public double selectCount(String state) {
        return meslStockMapper.selectCount(state);
    }

    @Override
    public String ia(double newProportion) {
        double count = selectCountImpl.selectCount("1");
        String tip = inventoryAlarm(newProportion, count);
        return tip;
    }


}
