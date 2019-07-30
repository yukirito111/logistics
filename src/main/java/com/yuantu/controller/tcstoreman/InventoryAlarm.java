package com.yuantu.controller.tcstoreman;

import com.yuantu.service.tcstoreman.SelectCount;
import com.yuantu.service.util.InventoryAlarmUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/InventoryAlarm", method = {RequestMethod.POST})
public class InventoryAlarm {
    @Autowired
    SelectCount selectCount;

    @ResponseBody //库存预警
    @RequestMapping(value = "/inventoryAlarm", method = {RequestMethod.POST})
    public String inventoryAlarm(@RequestParam double newProportion) {
        return selectCount.ia(newProportion);
    }

}
