package com.yuantu.service.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslStock;

import java.util.List;

public interface SelectStock {
    List<MeslStock> selectStock(String state);
}
