package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.courier.MeslMailMapper;
import com.yuantu.dao.tcsalesman.MeslTransportFormMapper;
import com.yuantu.entity.courier.MeslMail;
import com.yuantu.entity.tcsalesman.MeslTransportForm;
import com.yuantu.service.tcsalesman.InsertTransportForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertTransportFormImpl implements InsertTransportForm {
    @Autowired
    MeslTransportFormMapper meslTransportFormMapper;
    @Autowired
    MeslMailMapper meslMailMapper;

    @Override
    public String insertTransportForm(String transportNumber, String recipientAddress) {
        List<MeslMail> list = meslMailMapper.selectMailByState("2", recipientAddress);
        List<MeslTransportForm> meslTransportForms = meslTransportFormMapper.selectTransportForm();
        String flag = "true";
        String tip = "";
        for (MeslMail meslMail : list
        ) {
            String expressorderNumber = meslMail.getExpressorderNumber();
            for (MeslTransportForm meslTransportForm : meslTransportForms
            ) {
                String newExpressorderNumber = meslTransportForm.getExpressorderNumber();

                if (expressorderNumber.equals(newExpressorderNumber)) {
                    flag = "false";
                    tip = "添加失败";
                }
                if (flag.equals("true")) {
                    meslTransportFormMapper.insertTransportForm(transportNumber, expressorderNumber);
                    tip = "添加成功";
                    meslTransportFormMapper.selectTransportForm();
                }
            }
            if (meslTransportForms.size() == 0) {
                meslTransportFormMapper.insertTransportForm(transportNumber, expressorderNumber);
                tip = "添加成功";
                continue;
            }
        }
        return tip;
    }
}
