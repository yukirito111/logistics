package com.yuantu.dao.finance;

import com.yuantu.entity.finance.MeslPayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MeslPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_payment
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    int insert(MeslPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_payment
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    int insertSelective(MeslPayment record);

    List<MeslPayment> selectPaymentByPaymentType(String paymentType);

    MeslPayment selectPaymentByDate(@Param("paymentDate") String paymentDate, @Param("paymentType") String paymentType);

    MeslPayment selectPaymentByNumber(String number);

    double total(String paymentType);
    void insertPayment(MeslPayment meslPayment);
}