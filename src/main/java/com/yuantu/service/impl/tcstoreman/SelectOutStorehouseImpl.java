package com.yuantu.service.impl.tcstoreman;

import com.yuantu.dao.tcstoreman.MeslOutStorehouseMapper;
import com.yuantu.entity.tcstoreman.MeslOutStorehouse;
import com.yuantu.service.tcstoreman.SelectOutStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectOutStorehouseImpl implements SelectOutStorehouse {
    @Autowired
    MeslOutStorehouseMapper meslOutStorehouseMapper;
    @Override
    public List<MeslOutStorehouse> selectOutStorehouse() {
        List<MeslOutStorehouse> list = meslOutStorehouseMapper.selectOutStorehouse();
        return list;
    }
}
