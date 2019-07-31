package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.InsertShipping;
import com.yuantu.service.tcsalesman.SelectShipping;
import com.yuantu.service.tcsalesman.SelectShippingByNum;
import com.yuantu.service.tcsalesman.UpdateShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowShipping", method = {RequestMethod.POST})
public class ShowShipping {
    @Autowired
    InsertShipping insertShipping;
    @Autowired
    UpdateShipping updateShipping;
    @Autowired
    SelectShipping selectShipping;
    @Autowired
    SelectShippingByNum selectShippingByNum;

    @ResponseBody //添加并显示装运单
    @RequestMapping(value = "/insertShipping", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslShipping insertShipping(@RequestBody MeslShipping meslShipping) {
        MeslShipping meslShipping1 = insertShipping.insertShipping(meslShipping);
        return meslShipping1;
    }

    @ResponseBody //修改并显示装运单
    @RequestMapping(value = "/updateShipping", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslShipping updateShipping(@RequestBody MeslShipping meslShipping) {
        MeslShipping meslShipping1 = updateShipping.updateShipping(meslShipping);
        return meslShipping1;
    }

    @ResponseBody //显示所有装运单
    @RequestMapping(value = "/selectShipping", method = {RequestMethod.GET,RequestMethod.POST})
    public List<MeslShipping> selectShipping() {
        List<MeslShipping> list = selectShipping.selectShipping();
        return list;
    }

    @ResponseBody //根据快递单号显示装运单
    @RequestMapping(value = "/selectShippingByNum", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslShipping selectShippingByNum(@RequestParam String expressorderNumber) {
        MeslShipping meslShipping = selectShippingByNum.selectShippingByNum(expressorderNumber);
        return meslShipping;
    }
}
