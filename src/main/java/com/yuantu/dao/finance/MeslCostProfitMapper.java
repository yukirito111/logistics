package com.yuantu.dao.finance;

import com.yuantu.entity.finance.MeslCostProfit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface MeslCostProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_cost_profit
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    int insert(MeslCostProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_cost_profit
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    int insertSelective(MeslCostProfit record);
    List<MeslCostProfit> selectCostProfitByDate(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
    List<MeslCostProfit> selectCostProfitByNumber(@Param("deptNumber") String deptNumber,@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}