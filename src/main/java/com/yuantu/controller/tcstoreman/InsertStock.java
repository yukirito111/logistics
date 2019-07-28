package com.yuantu.controller.tcstoreman;

import com.yuantu.entity.tcstoreman.MeslIntoStorehouse;
import com.yuantu.entity.tcstoreman.MeslStock;
import com.yuantu.service.tcstoreman.InsertStore;
import com.yuantu.service.tcstoreman.SelectStorehouseByExpressorderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/InsertStock",method = {RequestMethod.GET,RequestMethod.POST})
public class InsertStock {
    @Autowired
    com.yuantu.service.tcstoreman.InsertStock insertStock;
    @Autowired
    InsertStore insertStore;
    @Autowired
    SelectStorehouseByExpressorderNumber selectStorehouseByExpressorderNumber;

    @ResponseBody //添加库存单
    @RequestMapping(value = "/insertStock",method = {RequestMethod.POST})
    public String insertStock(@RequestBody MeslIntoStorehouse meslIntoStorehouse){
        insertStore.insertStore(meslIntoStorehouse);
       MeslIntoStorehouse ms = selectStorehouseByExpressorderNumber.selectStorehouseByExpressorderNumber(meslIntoStorehouse.getExpressorderNumber());
       String expressorderNumber = ms.getExpressorderNumber();
       String areaCode = ms.getAreaCode();
       String rowCode = ms.getRowCode();
       String shelvesCode = ms.getShelvesCode();
       String SeatCode = ms.getSeatCode();
       String tip = "";
       try {
           MeslStock meslStock = new MeslStock();
           meslStock.setExpressorderNumber(expressorderNumber);
           meslStock.setAreaCode(areaCode);
           meslStock.setRowCode(rowCode);
           meslStock.setShelvesCode(shelvesCode);
           meslStock.setSeatCode(SeatCode);
           meslStock.setStockState("0");
           tip = insertStock.insertStock(meslStock);
       }catch (Exception e){
           e.printStackTrace();
       }
        return tip;
    }
}
