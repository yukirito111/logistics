package com.yuantu.service.util;


import com.yuantu.service.impl.tcstoreman.SelectCountImpl;
import com.yuantu.service.tcstoreman.SelectCount;

public class InventoryAlarmUtil {

    public static String inventoryAlarm(double newProportion,double count) {
        double capacity = 200;
        String tip = "";
        double proportion = count / capacity;
        if (proportion>=newProportion){
            tip = "库存已超出预设值";
        }
        /*else {
            tip = "库存良好";
        }*/
        return tip;
    }
}
