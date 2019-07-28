package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslCostProfitMapper;
import com.yuantu.entity.finance.MeslCostProfit;
import com.yuantu.service.finance.SelectCostProfitByNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SelectCostProfitByNumberImpl implements SelectCostProfitByNumber {
    @Autowired
    MeslCostProfitMapper meslCostProfitMapper;

    @Override
    public List<MeslCostProfit> selectCostProfitByNumber(String deptNumber, Date startDate, Date endDate) {
        List<MeslCostProfit> list = meslCostProfitMapper.selectCostProfitByNumber(deptNumber, startDate, endDate);
        return list;
    }
}
