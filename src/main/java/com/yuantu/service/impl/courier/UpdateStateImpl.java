package com.yuantu.service.impl.courier;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.service.courier.UpdateState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStateImpl implements UpdateState {
    @Autowired
    MeslMailMapper meslMailMapper;
    @Override
    public void updateState(String state) {
        meslMailMapper.updateState(state);
    }
}
