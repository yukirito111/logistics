package com.yuantu.controller.finance;

import com.yuantu.entity.finance.MeslReceipt;
import com.yuantu.service.finance.SelectAllReceipt;
import com.yuantu.service.finance.SelectReceiptByDate;
import com.yuantu.service.finance.SelectTotalActualReceiptMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowSettlement", method = {RequestMethod.POST})
public class ShowSettlement {
    @Autowired
    SelectAllReceipt selectAllReceipt;
    @Autowired
    SelectReceiptByDate selectReceiptByDate;
    @Autowired
    SelectTotalActualReceiptMoney selectTotalActualReceiptMoney;

    @ResponseBody //查询结算管理表
    @RequestMapping(value = "/showAllSettlement", method = {RequestMethod.POST})
    public List<MeslReceipt> showAllSettlement() {
        List<MeslReceipt> list = selectAllReceipt.selectAllReceipt();
        return list;
    }

    @ResponseBody //根据日期查询结算管理表
    @RequestMapping(value = "/showSettlementByDate", method = {RequestMethod.POST})
    public MeslReceipt showSettlementByDate(@RequestParam String date) {
        MeslReceipt meslReceipt = selectReceiptByDate.selectReceiptByDate(date);
        return meslReceipt;
    }

    @ResponseBody //合计
    @RequestMapping(value = "/totalReceipt", method = {RequestMethod.POST})
    public double totalReceipt() {
        double total = selectTotalActualReceiptMoney.selectTotalActualReceiptMoney();
        return total;
    }
}
