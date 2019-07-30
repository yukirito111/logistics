package com.yuantu.service.courier;

import com.yuantu.entity.courier.MeslMail;

import java.util.List;

public interface SelectMailByState {
    List<MeslMail> selectMailByState(String state,String recipientAddress);
}
