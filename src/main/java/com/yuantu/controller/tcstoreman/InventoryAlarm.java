package com.yuantu.controller.tcstoreman;

import com.yuantu.service.util.InventoryAlarmUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/InventoryAlarm",method = {RequestMethod.POST})
public class InventoryAlarm {
    @ResponseBody //库存预警
    @RequestMapping(value = "/inventoryAlarm",method = {RequestMethod.POST})
    public String inventoryAlarm(@RequestParam double capacity){
        String tip = "";
        double proportion = InventoryAlarmUtil.inventoryAlarm(capacity);
        if (proportion>=0.80){
            tip = "库存过多";
        }
        return tip;
    }
}
