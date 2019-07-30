package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslReceiveMapper;
import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.SelectReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectReceiveImpl implements SelectReceive {
    @Autowired
    MeslReceiveMapper meslReceiveMapper;

    @Override
    public List<MeslReceive> selectReceive() {
        List<MeslReceive> list = meslReceiveMapper.selectReceive();
        return list;
    }
}
