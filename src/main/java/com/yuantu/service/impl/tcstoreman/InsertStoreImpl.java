package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslIntoStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import com.yuantu.service.tcstoreman.InsertStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InsertStoreImpl implements InsertStore {
    @Autowired
    MeslIntoStorehouseMapper meslIntoStorehouseMapper;
    @Override
    public void insertStore(MeslIntoStorehouse meslIntoStorehouse) {
        List<MeslIntoStorehouse> list = meslIntoStorehouseMapper.selectStorehouse();
        String flag = "true";

        for (MeslIntoStorehouse ms:list
             ) {
            if (meslIntoStorehouse.getExpressorderNumber().equals(ms.getExpressorderNumber())){
                flag = "false";
            }
        }
        if (flag == "true"){
            meslIntoStorehouseMapper.insertStore(meslIntoStorehouse);
        }

    }
}
