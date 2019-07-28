package com.yuantu.service.impl.finance;

import com.yuantu.dao.finance.MeslManagementSituationMapper;
import com.yuantu.entity.finance.MeslManagementSituationVO;
import com.yuantu.service.finance.SelectManagementSituationByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SelectManagementSituationByDateImpl implements SelectManagementSituationByDate {
    @Autowired
    MeslManagementSituationMapper meslManagementSituationMapper;

    @Override
    public List<MeslManagementSituationVO> selectManagementSituationByDate(Date startDate, Date endDate) {
        List<MeslManagementSituationVO> list = meslManagementSituationMapper.selectManagementSituationByDate(startDate, endDate);
        return list;
    }
}
