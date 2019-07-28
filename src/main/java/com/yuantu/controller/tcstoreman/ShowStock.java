package com.yuantu.controller.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslStock;
import com.yuantu.service.tcstoreman.SelectStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowStock",method = {RequestMethod.POST})
public class ShowStock {
    @Autowired
    SelectStock selectStock;
    @ResponseBody //查询库存单
    @RequestMapping(value = "/showStock",method = {RequestMethod.POST})
    public List<MeslStock> showStock(){
        List<MeslStock>list = selectStock.selectStock("0");
        return list;
    }
}
