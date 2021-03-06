package com.yuantu.dao.finance;

import com.yuantu.entity.finance.MeslManagementSituation;
import com.yuantu.entity.finance.MeslManagementSituationVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface MeslManagementSituationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_management_situation
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    int insert(MeslManagementSituation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mesl_management_situation
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    int insertSelective(MeslManagementSituation record);


    List<MeslManagementSituationVO> selectManagementSituationByDate(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}