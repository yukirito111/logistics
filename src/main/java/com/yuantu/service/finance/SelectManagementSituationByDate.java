package com.yuantu.service.finance;

import com.yuantu.entity.finance.MeslManagementSituationVO;

import java.util.Date;
import java.util.List;

public interface SelectManagementSituationByDate {
    List<MeslManagementSituationVO> selectManagementSituationByDate(Date startDate, Date endDate);
}
