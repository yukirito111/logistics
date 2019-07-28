package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslShipping;
import com.yuantu.service.tcsalesman.InsertShipping;
import com.yuantu.service.tcsalesman.UpdateShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/ShowShipping",method = RequestMethod.POST)
public class ShowShipping {
    @Autowired
    InsertShipping insertShipping;
    @Autowired
    UpdateShipping updateShipping;
    @ResponseBody //添加并显示装运单
    @RequestMapping(value = "/insertShipping",method = {RequestMethod.POST})
    public MeslShipping insertShipping(@RequestBody MeslShipping meslShipping){
        MeslShipping ms = insertShipping.insertShipping(meslShipping);
        return ms;
    }
    @ResponseBody
    @RequestMapping(value = "/updateShipping",method = {RequestMethod.POST})
    public void updateShipping(@RequestParam String shippingorderNumber,@RequestParam String shippingTime,@RequestParam String trainNumber,@RequestParam String origin,@RequestParam String destination,@RequestParam String carriageNumber,@RequestParam String operator,@RequestParam Integer id){
        updateShipping.updateShippingorderNumber(shippingorderNumber,id);
        updateShipping.updateShippingTime(shippingTime,id);
        updateShipping.updateTrainNumber(trainNumber,id);
        updateShipping.updateOrigin(origin,id);
        updateShipping.updateDestination(destination,id);
        updateShipping.updateCarriageNumber(carriageNumber,id);
        updateShipping.updateOperator(operator,id);
    }
}
