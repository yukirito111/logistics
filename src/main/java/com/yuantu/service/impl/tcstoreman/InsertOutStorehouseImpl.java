package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslOutStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslOutStorehouse;
import com.yuantu.service.tcstoreman.InsertOutStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertOutStorehouseImpl implements InsertOutStorehouse {
    @Autowired
    MeslOutStorehouseMapper meslOutStorehouseMapper;

    @Override
    public String insertOutStorehouse(MeslOutStorehouse meslOutStorehouse) {
        String tip = "";
        String flag = "true";
        List<MeslOutStorehouse> list = meslOutStorehouseMapper.selectOutStorehouse();
        for (MeslOutStorehouse ms : list
        ) {
            if (ms.getExpressorderNumber().equals(meslOutStorehouse.getExpressorderNumber())) {
                tip = "添加失败";
                flag = "false";
            }
        }
        if (flag.equals("true")) {
            meslOutStorehouseMapper.insertOutStorehouse(meslOutStorehouse);
            tip = "添加成功";
        }
        return tip;
    }
}
