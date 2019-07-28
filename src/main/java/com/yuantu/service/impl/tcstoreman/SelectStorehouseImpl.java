package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslIntoStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import com.yuantu.service.tcstoreman.SelectStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectStorehouseImpl implements SelectStorehouse {
    @Autowired
    MeslIntoStorehouseMapper meslIntoStorehouseMapper;

    @Override
    public List<MeslIntoStorehouse> selectStorehouse() {
        List<MeslIntoStorehouse> list = meslIntoStorehouseMapper.selectStorehouse();
        return list;
    }
}
