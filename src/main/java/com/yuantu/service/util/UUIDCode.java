package com.yuantu.service.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 生成uuid编号
 *
 * @author 吴建凯
 * @date 2018年11月14日
 */
public class UUIDCode {

    public static String createID() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id.replace("-", "");
    }

    /**
     * coolfors增加生成integer的ID的方法
     *
     * @return
     */

    public static String create() {
        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        //System.out.println(str);

        Random random = new Random();

        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数

        //System.out.println(rannum);

        return str + rannum;// 当前时间

    }

}


