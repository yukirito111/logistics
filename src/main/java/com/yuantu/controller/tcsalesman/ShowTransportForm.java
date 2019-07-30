package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslTransportForm;
import com.yuantu.service.tcsalesman.InsertTransportForm;
import com.yuantu.service.tcsalesman.SelectTransportForm;
import com.yuantu.service.tcsalesman.SelectTransportFormByExpressorderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/showTransportForm", method = {RequestMethod.POST})
public class ShowTransportForm {
    @Autowired
    InsertTransportForm insertTransportForm;
    @Autowired
    SelectTransportForm selectTransportForm;
    @Autowired
    SelectTransportFormByExpressorderNumber selectTransportFormByExpressorderNumber;

    @ResponseBody //添加货运单
    @RequestMapping(value = "/insertTransportForm", method = {RequestMethod.POST})
    public String insertTransportForm(@RequestParam String transportNumber, @RequestParam String recipientAddress) {
        String tip = insertTransportForm.insertTransportForm(transportNumber, recipientAddress);
        return tip;
    }

    @ResponseBody //查询货运单
    @RequestMapping(value = "/selectTransportForm", method = {RequestMethod.POST})
    public List<MeslTransportForm> selectTransportForm() {
        List<MeslTransportForm> meslTransportForms = selectTransportForm.selectTransportForm();
        return meslTransportForms;
    }

    @ResponseBody //根据快递单号查询货运单号
    @RequestMapping(value = "/selectFormByNum", method = {RequestMethod.POST})
    public MeslTransportForm selectFormByNum(@RequestParam String expressorderNumber) {
        MeslTransportForm meslTransportForm = selectTransportFormByExpressorderNumber.selectTransportFormByExpressorderNumber(expressorderNumber);
        return meslTransportForm;
    }
}
