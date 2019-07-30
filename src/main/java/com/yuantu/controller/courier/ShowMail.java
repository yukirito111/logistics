package com.yuantu.controller.courier;

import com.yuantu.entity.courier.MeslMail;
import com.yuantu.service.courier.SelectMailByState;
import com.yuantu.service.courier.UpdateMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/ShowMail", method = {RequestMethod.GET, RequestMethod.POST})
public class ShowMail {
    @Autowired
    private SelectMailByState selectMailByState;
    @Autowired
    private UpdateMail updateMail;

    @ResponseBody //查询本地未揽件订单
    @RequestMapping(value = "/showMail", method = {RequestMethod.POST})
    public List<MeslMail> showMail(@RequestParam String recipientAddress) {
        List<MeslMail> list = selectMailByState.selectMailByState("1", recipientAddress);
        return list;
    }

    @ResponseBody //添加货物信息
    @RequestMapping(value = "/updateMail", method = {RequestMethod.POST})
    public String updateMail(@RequestBody MeslMail meslMail) {
        return updateMail.updateMail(meslMail);
    }
}
