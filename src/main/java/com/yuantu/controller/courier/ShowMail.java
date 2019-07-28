package com.yuantu.controller.courier;

import com.yuantu.entity.courier.MeslMail;
import com.yuantu.service.courier.SelectMailByState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowMail", method = {RequestMethod.GET, RequestMethod.POST})
public class ShowMail {
    @Autowired
    private SelectMailByState selectMailByState;

    @ResponseBody //查询未揽件订单
    @RequestMapping(value = "/showMail", method = {RequestMethod.POST})
    public List<MeslMail> showMail() {
        List<MeslMail> list = selectMailByState.selectMailByState("0");
        return list;
    }
}
