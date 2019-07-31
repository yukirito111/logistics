package com.yuantu.controller.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslLogistics;
import com.yuantu.service.tcsalesman.InsertLogistics;
import com.yuantu.service.tcsalesman.SelectLogisticsByNum;
import com.yuantu.service.tcsalesman.UpdateLogisticsNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/ShowLogistics", method = {RequestMethod.GET,RequestMethod.POST})
public class ShowLogistics {
    @Autowired
    InsertLogistics insertLogistics;
    @Autowired
    UpdateLogisticsNum updateLogisticsNum;
    @Autowired
    SelectLogisticsByNum selectLogisticsByNum;

    @ResponseBody //添加物流单
    @RequestMapping(value = "/inseertLogistics", method = {RequestMethod.GET,RequestMethod.POST})
    public void insertLogistics(@RequestBody MeslLogistics meslLogistics, @RequestParam String expressorderNumber) {
        insertLogistics.insertLogistics(meslLogistics, expressorderNumber);
    }

    @ResponseBody //设置物流编号
    @RequestMapping(value = "/updateLogisticsNum", method = {RequestMethod.GET,RequestMethod.POST})
    public void updateLogisticsNum(String logisticsNumber, Integer id) {
        updateLogisticsNum.updateLogisticsNum(logisticsNumber, id);
    }

    @ResponseBody //根据物流编号查询物流表
    @RequestMapping(value = "/selectLogisticsByNum", method = {RequestMethod.GET,RequestMethod.POST})
    public MeslLogistics selectLogisticsByNum(@RequestParam String logisticsNumber) {
        MeslLogistics meslLogistics = selectLogisticsByNum.selectLogisticsByNum(logisticsNumber);
        return meslLogistics;
    }
}
