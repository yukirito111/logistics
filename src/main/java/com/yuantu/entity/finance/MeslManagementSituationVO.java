package com.yuantu.entity.finance;

import java.util.Date;

public class MeslManagementSituationVO {
    private Date managementSituationDate;
    private String deptNumber;
    private String actualReceiptMoney;
    private String paymentMoney;

    public Date getManagementSituationDate() {
        return managementSituationDate;
    }

    public void setManagementSituationDate(Date managementSituationDate) {
        this.managementSituationDate = managementSituationDate;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getActualReceiptMoney() {
        return actualReceiptMoney;
    }

    public void setActualReceiptMoney(String actualReceiptMoney) {
        this.actualReceiptMoney = actualReceiptMoney;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }
}
