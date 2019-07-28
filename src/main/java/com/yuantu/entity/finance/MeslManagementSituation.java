package com.yuantu.entity.finance;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MeslManagementSituation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_management_situation.id
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_management_situation.management_situation_date
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */

    private Date managementSituationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_management_situation.dept_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    private String deptNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_management_situation.receiptorder_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    private String receiptorderNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_management_situation.payment_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    private String paymentNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_management_situation.id
     *
     * @return the value of mesl_management_situation.id
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_management_situation.id
     *
     * @param id the value for mesl_management_situation.id
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_management_situation.management_situation_date
     *
     * @return the value of mesl_management_situation.management_situation_date
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public Date getManagementSituationDate() {
        return managementSituationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_management_situation.management_situation_date
     *
     * @param managementSituationDate the value for mesl_management_situation.management_situation_date
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public void setManagementSituationDate(Date managementSituationDate) {
        this.managementSituationDate = managementSituationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_management_situation.dept_number
     *
     * @return the value of mesl_management_situation.dept_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public String getDeptNumber() {
        return deptNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_management_situation.dept_number
     *
     * @param deptNumber the value for mesl_management_situation.dept_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber == null ? null : deptNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_management_situation.receiptorder_number
     *
     * @return the value of mesl_management_situation.receiptorder_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public String getReceiptorderNumber() {
        return receiptorderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_management_situation.receiptorder_number
     *
     * @param receiptorderNumber the value for mesl_management_situation.receiptorder_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public void setReceiptorderNumber(String receiptorderNumber) {
        this.receiptorderNumber = receiptorderNumber == null ? null : receiptorderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_management_situation.payment_number
     *
     * @return the value of mesl_management_situation.payment_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_management_situation.payment_number
     *
     * @param paymentNumber the value for mesl_management_situation.payment_number
     *
     * @mbggenerated Fri Jun 28 16:00:13 CST 2019
     */
    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber == null ? null : paymentNumber.trim();
    }
}