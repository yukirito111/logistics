package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.InsertReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ShowReceive", method = {RequestMethod.GET, RequestMethod.POST})
public class ShowReceive {
    @Autowired
    private InsertReceive insertReceive;

    @ResponseBody //添加并显示接收单
    @RequestMapping(value = "/showReceive", method = {RequestMethod.POST})
    public MeslReceive showReceive(@RequestParam String receiveNumber, @RequestParam String receiveTime, @RequestParam String origin, @RequestParam String receivePlace, @RequestParam String freightBatchNumber, @RequestParam String freight) {
        MeslReceive meslReceive = insertReceive.insertReceive(receiveNumber, receiveTime, origin, receivePlace, freightBatchNumber, freight);
        return meslReceive;
    }
}
