package com.yuantu.service.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;

import java.util.Date;

public interface SelectStorehouseByDate {
    MeslIntoStorehouse selectStorehouseByDate(Date startDate,Date endDate);
}
