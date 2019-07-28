package com.yuantu.service.impl.courier;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.entity.courier.MeslMail;
import com.yuantu.service.courier.SelectMailByState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SelectMailByStateImpl implements SelectMailByState {
    @Autowired
    MeslMailMapper meslMailMapper;
    @Override
    public List<MeslMail> selectMailByState(String state) {
        List<MeslMail> list = meslMailMapper.selectMailByState(state);
        return list;
    }
}
