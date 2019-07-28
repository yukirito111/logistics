package com.yuantu.service.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date conversion(String str) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
