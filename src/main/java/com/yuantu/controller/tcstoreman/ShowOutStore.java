package com.yuantu.controller.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslOutStorehouse;
import com.yuantu.service.tcstoreman.SelectOutStorehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowOutStore", method = {RequestMethod.POST})
public class ShowOutStore {
    @Autowired
    SelectOutStorehouse selectOutStorehouse;

    @ResponseBody //查询出库单
    @RequestMapping(value = "/showOutStore", method = {RequestMethod.POST})
    public List<MeslOutStorehouse> showOutStore() {
        List<MeslOutStorehouse> list = selectOutStorehouse.selectOutStorehouse();
        return list;
    }
}
