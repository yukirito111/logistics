package com.yuantu.service.impl.courier;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.entity.courier.MeslMail;
import com.yuantu.service.courier.UpdateMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMailImpl implements UpdateMail {
    @Autowired
    MeslMailMapper meslMailMapper;

    @Override
    public String updateMail(MeslMail meslMail) {
        meslMailMapper.updateMail(meslMail);
        return "添加成功";
    }
}
