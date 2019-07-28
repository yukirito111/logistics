package com.yuantu.dao.finance;

import com.yuantu.entity.finance.MeslAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MeslAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_account
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    int insert(MeslAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_account
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    int insertSelective(MeslAccount record);
    MeslAccount selectAccount(Integer id);
    void insertAccount(MeslAccount meslAccount);
}