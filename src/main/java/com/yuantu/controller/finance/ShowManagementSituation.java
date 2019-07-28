package com.yuantu.controller.finance;


import com.yuantu.entity.finance.MeslManagementSituationVO;
import com.yuantu.service.finance.SelectManagementSituationByDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;
import java.util.List;

import static com.yuantu.service.util.DateUtil.conversion;

@Controller
@RequestMapping(value = "/ShowManagementSituation", method = {RequestMethod.GET, RequestMethod.POST})
public class ShowManagementSituation {
    @Autowired
    private SelectManagementSituationByDate selectManagementSituationByDate;

    @ResponseBody //通过日期查询经营情况表
    @RequestMapping(value = "/showManagementSituation", method = RequestMethod.POST)
    public List<MeslManagementSituationVO> showManagementSituation(@RequestParam String startDate, @RequestParam String endDate) {
        Date newstartDate = conversion(startDate);
        Date newendDate = conversion(endDate);
        List<MeslManagementSituationVO> list = selectManagementSituationByDate.selectManagementSituationByDate(newstartDate, newendDate);
        return list;
    }
}
