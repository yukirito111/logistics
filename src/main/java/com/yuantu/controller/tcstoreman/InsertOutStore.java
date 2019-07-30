package com.yuantu.controller.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslOutStorehouse;
import com.yuantu.entity.tcstoreman.MeslStock;
import com.yuantu.service.tcstoreman.InsertOutStorehouse;
import com.yuantu.service.tcstoreman.SelectStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/InsertOutStore", method = {RequestMethod.POST})
public class InsertOutStore {
    @Autowired
    InsertOutStorehouse insertOutStorehouse;
    @Autowired
    SelectStock selectStock;

    @ResponseBody //添加出库单
    @RequestMapping(value = "/insertOutStore", method = {RequestMethod.POST})
    public String insertOutStore(@RequestBody MeslOutStorehouse meslOutStorehouse) {
        List<MeslStock> list = selectStock.selectStock("1");
        String tip = "";
        String flag = "true";
        for (MeslStock meslStock : list
        ) {
            String expressorderNumber = meslStock.getExpressorderNumber();
            meslOutStorehouse.setExpressorderNumber(expressorderNumber);
            tip = insertOutStorehouse.insertOutStorehouse(meslOutStorehouse);
            if (tip.equals("添加失败")) {
                flag = "false";
            }
            if (flag.equals("true")) {
                break;
            }
        }
        return tip;
    }
}
