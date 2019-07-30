package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslTransportFormMapper;
import com.yuantu.entity.tcsalesman.MeslTransportForm;
import com.yuantu.service.tcsalesman.SelectTransportForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectTransportFormImpl implements SelectTransportForm {
    @Autowired
    MeslTransportFormMapper meslTransportFormMapper;

    @Override
    public List<MeslTransportForm> selectTransportForm() {
        List<MeslTransportForm> list = meslTransportFormMapper.selectTransportForm();
        return list;
    }
}
