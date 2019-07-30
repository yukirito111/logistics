package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.UpdateReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateReceiveImpl implements UpdateReceive {
    @Autowired
    MeslReceiveMapper meslReceiveMapper;

    @Override
    public MeslReceive updateReceive(MeslReceive meslReceive) {
        MeslReceive meslReceive1 = meslReceiveMapper.updateReceive(meslReceive);
        return meslReceive1;
    }
}
