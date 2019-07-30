package com.yuantu.service.tcsalesman;


import com.yuantu.entity.tcsalesman.MeslShipping;

public interface SelectShippingByNum {
    MeslShipping selectShippingByNum(String expressorderNumber);
}
