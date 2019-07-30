package com.yuantu.service.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslReceive;

public interface SelectReceiveByNum {
    MeslReceive selectReceiveByNum(String expressorderNumber);
}
