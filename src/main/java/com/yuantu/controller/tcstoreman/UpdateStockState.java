package com.yuantu.controller.tcstoreman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/UpdateStockState", method = {RequestMethod.GET,RequestMethod.POST})
public class UpdateStockState {
    @Autowired
    com.yuantu.service.tcstoreman.UpdateStockState updateStockState;

    @ResponseBody //修改库存状态
    @RequestMapping(value = "/updateStockState", method = {RequestMethod.GET,RequestMethod.POST})
    public String updateState(@RequestParam String id) {
        String tip = updateStockState.updateState("1", id);
        return tip;
    }
}
