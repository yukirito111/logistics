package com.yuantu.controller.finance;

import com.yuantu.entity.finance.MeslCostProfit;
import com.yuantu.service.finance.InsertCostProfit;
import com.yuantu.service.finance.SelectCostProfitByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.yuantu.service.util.DateUtil.conversion;

@Controller
@RequestMapping(value = "/ShowCostProfit", method = {RequestMethod.GET,RequestMethod.POST})
public class ShowCostProfit {
    @Autowired
    SelectCostProfitByDate selectCostProfitByDate;
    @Autowired
    InsertCostProfit insertCostProfit;

    @ResponseBody //根据日期查询成本收益表
    @RequestMapping(value = "/showCostProfitByDate",method = {RequestMethod.GET,RequestMethod.POST})
    public List<MeslCostProfit> showCostProfitByDate(@RequestParam String startDate, @RequestParam String endDate) {
        Date newStartDate = conversion(startDate);
        Date newEndDate = conversion(endDate);
        List<MeslCostProfit> list = selectCostProfitByDate.selectCostProfitByDate(newStartDate, newEndDate);
        return list;
    }

    @ResponseBody //添加成本收益表
    @RequestMapping(value = "/insertCostProfit", method = {RequestMethod.GET,RequestMethod.POST})
    public String insertCostProfit(@RequestBody MeslCostProfit meslCostProfit) {
        String tip = insertCostProfit.insertCostProfit(meslCostProfit);
        return tip;
    }
}
