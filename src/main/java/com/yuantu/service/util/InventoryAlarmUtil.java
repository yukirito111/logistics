package com.yuantu.service.util;


import com.yuantu.service.impl.tcstoreman.SelectCountImpl;
import com.yuantu.service.tcstoreman.SelectCount;

public class InventoryAlarmUtil {

    public static double inventoryAlarm(double capacity ){
        SelectCountImpl selectCountImpl = new SelectCountImpl();
        double count = selectCountImpl.selectCount("1");
        double proportion = count/capacity;
        return proportion;
    }
}
