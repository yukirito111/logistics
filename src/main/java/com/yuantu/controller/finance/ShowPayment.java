package com.yuantu.controller.finance;

import com.yuantu.entity.finance.MeslPayment;
import com.yuantu.service.finance.SelectPaymentByDate;
import com.yuantu.service.finance.SelectPaymentByNumber;
import com.yuantu.service.finance.SelectPaymentByPaymentType;
import com.yuantu.service.finance.SelectTotalPaymentMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowPayment", method = {RequestMethod.POST})
public class ShowPayment {
    @Autowired
    SelectPaymentByNumber selectPaymentByNumber;
    @Autowired
    SelectPaymentByDate selectPaymentByDate;
    @Autowired
    SelectPaymentByPaymentType selectPaymentByPaymentType;
    @Autowired
    SelectTotalPaymentMoney selectTotalPaymentMoney;

    @ResponseBody //通过付款单编号查询付款单信息
    @RequestMapping(value = "/showPaymentByNumber", method = {RequestMethod.POST})
    public MeslPayment showPaymentByNumber(@RequestParam String number) {
        MeslPayment meslPayment = selectPaymentByNumber.selectPaymentByNumber(number);
        return meslPayment;
    }

    @ResponseBody //通过付款单日期查询付款单信息
    @RequestMapping(value = "showPaymentByDate", method = {RequestMethod.POST})
    public MeslPayment showPaymentByDate(@RequestParam String date, @RequestParam String type) {
        MeslPayment meslPayment = selectPaymentByDate.selectPaymentByDateByDate(date, type);
        return meslPayment;
    }

    @ResponseBody //通过付款单类型查询付款单信息
    @RequestMapping(value = "/showPaymentByType", method = {RequestMethod.POST})
    public List<MeslPayment> showPaymentByType(@RequestParam String type) {
        List<MeslPayment> list = selectPaymentByPaymentType.selectPaymentByPaymentType(type);
        return list;
    }

    @ResponseBody //合计
    @RequestMapping(value = "/totalPaymentMoney", method = {RequestMethod.POST})
    public double totalPaymentMoney(@RequestParam String type) {
        double total = selectTotalPaymentMoney.selectTotalPaymentMoney(type);
        return total;
    }
}
