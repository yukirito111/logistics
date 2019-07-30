package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslCostProfitMapper;
import com.yuantu.entity.finance.MeslCostProfit;
import com.yuantu.service.finance.InsertCostProfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.yuantu.service.util.DateUtil.conversion;

@Service
public class InsertCostProfitImpl implements InsertCostProfit {
    @Autowired
    MeslCostProfitMapper meslCostProfitMapper;

    @Override
    public String insertCostProfit(MeslCostProfit meslCostProfit) {
        double totalProfit = meslCostProfit.getTotalExpend() - meslCostProfit.getTotalIncome();
        meslCostProfit.setTotalProfit(totalProfit);
        meslCostProfitMapper.insertCostProfit(meslCostProfit);
        return "添加成功";
    }
}
