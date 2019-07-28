package com.yuantu.controller.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import com.yuantu.service.tcstoreman.SelectStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowStorehouse",method = {RequestMethod.GET,RequestMethod.POST})
public class ShowStorehouse {
    @Autowired
    private SelectStorehouse selectStorehouse;
    @ResponseBody //查询入库单
    @RequestMapping(value = "/showStorehouse",method = {RequestMethod.POST})
    public List<MeslIntoStorehouse> showStorehouse(){
        List<MeslIntoStorehouse> list = selectStorehouse.selectStorehouse();
        return list;
    }
}
