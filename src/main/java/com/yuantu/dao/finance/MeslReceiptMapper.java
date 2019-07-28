package com.yuantu.dao.finance;

import com.yuantu.entity.finance.MeslReceipt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeslReceiptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_receipt
     *
     * @mbggenerated Wed Jul 10 16:15:15 CST 2019
     */
    int insert(MeslReceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_receipt
     *
     * @mbggenerated Wed Jul 10 16:15:15 CST 2019
     */
    int insertSelective(MeslReceipt record);

    MeslReceipt selectReceiptByDate(String receiptDate);

    List<MeslReceipt> selectAllReceipt();

    double total();
}