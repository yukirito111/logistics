package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslCostProfitMapper;
import com.yuantu.entity.finance.MeslCostProfit;
import com.yuantu.service.finance.SelectCostProfitByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SelectCostProfitByDateImpl implements SelectCostProfitByDate {
    @Autowired
    MeslCostProfitMapper meslCostProfitMapper;

    @Override
    public List<MeslCostProfit> selectCostProfitByDate(Date startDate, Date endDate) {
        List<MeslCostProfit> list = meslCostProfitMapper.selectCostProfitByDate(startDate, endDate);
        return list;
    }
}
