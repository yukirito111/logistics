package com.yuantu.dao.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslOutStorehouse;

import java.util.List;

public interface MeslOutStorehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_out_storehouse
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    int insert(MeslOutStorehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_out_storehouse
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    int insertSelective(MeslOutStorehouse record);

    void insertOutStorehouse(MeslOutStorehouse meslOutStorehouse);

    List<MeslOutStorehouse> selectOutStorehouse();
}