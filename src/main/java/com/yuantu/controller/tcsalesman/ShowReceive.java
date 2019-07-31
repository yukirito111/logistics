package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslReceive;
import com.yuantu.service.tcsalesman.InsertReceive;
import com.yuantu.service.tcsalesman.SelectReceive;
import com.yuantu.service.tcsalesman.SelectReceiveByNum;
import com.yuantu.service.tcsalesman.UpdateReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowReceive", method = {RequestMethod.GET,RequestMethod.POST})
public class ShowReceive {
    @Autowired
    InsertReceive insertReceive;
    @Autowired
    UpdateReceive updateReceive;
    @Autowired
    SelectReceive selectReceive;
    @Autowired
    SelectReceiveByNum selectReceiveByNum;

    @ResponseBody //添加并显示接收单
    @RequestMapping(value = "/insertReceive", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslReceive insertReceive(@RequestBody MeslReceive meslReceive) {
        MeslReceive meslReceive1 = insertReceive.insertReceive(meslReceive);
        return meslReceive1;
    }

    @ResponseBody //修改并显示接收单
    @RequestMapping(value = "/updateReceive", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslReceive updateReceive(@RequestBody MeslReceive meslReceive) {
        MeslReceive meslReceive1 = updateReceive.updateReceive(meslReceive);
        return meslReceive1;
    }

    @ResponseBody//显示所有接收单
    @RequestMapping(value = "/selectReceive", method = {RequestMethod.GET,RequestMethod.POST})
    public List<MeslReceive> selectReceive() {
        List<MeslReceive> list = selectReceive.selectReceive();
        return list;
    }

    @ResponseBody //根据快递单号显示接收单
    @RequestMapping(value = "/selectReceiveByNum", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslReceive selectReceiveByNum(@RequestParam String expressorderNumber) {
        MeslReceive meslReceive = selectReceiveByNum.selectReceiveByNum(expressorderNumber);
        return meslReceive;
    }
}
