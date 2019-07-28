package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslCostProfit;

import java.util.Date;
import java.util.List;

public interface SelectCostProfitByDate {
    List<MeslCostProfit> selectCostProfitByDate(Date startDate, Date endDate);
}
