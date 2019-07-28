package com.yuantu.controller.courier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/UpdateState", method = {RequestMethod.GET, RequestMethod.POST})
public class UpdateState {
    @Autowired
    private com.yuantu.service.courier.UpdateState updateState;

    @ResponseBody //揽件
    @RequestMapping(value = "/updateState", method = {RequestMethod.POST})
    public void updateState(@RequestParam String newState) {
        updateState.updateState(newState);
    }
}
