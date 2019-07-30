package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.entity.courier.MeslMail;
import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.InsertReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertReceiveImpl implements InsertReceive {
    @Autowired
    MeslReceiveMapper meslReceiveMapper;
    @Autowired
    MeslMailMapper meslMailMapper;

    @Override
    public MeslReceive insertReceive(MeslReceive meslReceive) {
        MeslReceive meslReceive1 = meslReceiveMapper.insertReceive(meslReceive);
        return meslReceive1;
    }
}
