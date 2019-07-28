package com.yuantu.controller.finance;

import com.yuantu.entity.finance.MeslCostProfit;
import com.yuantu.service.finance.SelectCostProfitByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

import static com.yuantu.service.util.DateUtil.conversion;

@Controller
@RequestMapping(value = "/ShowCostProfit",method = {RequestMethod.POST})
public class ShowCostProfit {
    @Autowired
    SelectCostProfitByDate selectCostProfitByDate;
    @ResponseBody //根据日期查询成本收益表
    @RequestMapping(value = "/showCostProfitByDate")
    public List<MeslCostProfit> showCostProfitByDate(@RequestParam String startDate,@RequestParam String endDate){
        Date newStartDate = conversion(startDate);
        Date newEndDate = conversion(endDate);
        List<MeslCostProfit> list = selectCostProfitByDate.selectCostProfitByDate(newStartDate,newStartDate);
        return list;
    }
}
