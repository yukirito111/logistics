package com.yuantu.service.impl.tcstoreman;


import com.yuantu.dao.tcstoreman.MeslStockMapper;
import com.yuantu.entity.tcstoreman.MeslStock;
import com.yuantu.service.tcstoreman.InsertStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertStockImpl implements InsertStock {
    @Autowired
    MeslStockMapper meslStockMapper;

    @Override
    public String insertStock(MeslStock meslStock) {
        List<MeslStock> list = meslStockMapper.selectStock("0");
        String tip = "";
        String flag = "true";
        for (MeslStock ms : list
        ) {
            if (meslStock.getExpressorderNumber().equals(ms.getExpressorderNumber())) {
                tip = "订单已存在";
                flag = "false";
            }
        }
        if (flag.equals("true")) {
            tip = "入库成功";
            meslStockMapper.insertStock(meslStock);
        }
        return tip;
    }
}
