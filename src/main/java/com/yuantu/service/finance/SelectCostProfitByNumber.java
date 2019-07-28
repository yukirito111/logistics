package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslCostProfit;

import java.util.Date;
import java.util.List;

public interface SelectCostProfitByNumber {
    List<MeslCostProfit> selectCostProfitByNumber(String deptNumber, Date startDate, Date endDate);
}
