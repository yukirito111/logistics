package com.yuantu.entity.finance;

public class MeslAccount {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.id
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.dept
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String dept;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.personnel
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String personnel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.trucks
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String trucks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.stock
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.account_name
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String accountName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_account.account_money
     *
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    private String accountMoney;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.id
     *
     * @return the value of mesl_account.id
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.id
     *
     * @param id the value for mesl_account.id
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.dept
     *
     * @return the value of mesl_account.dept
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getDept() {
        return dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.dept
     *
     * @param dept the value for mesl_account.dept
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.personnel
     *
     * @return the value of mesl_account.personnel
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getPersonnel() {
        return personnel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.personnel
     *
     * @param personnel the value for mesl_account.personnel
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setPersonnel(String personnel) {
        this.personnel = personnel == null ? null : personnel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.trucks
     *
     * @return the value of mesl_account.trucks
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getTrucks() {
        return trucks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.trucks
     *
     * @param trucks the value for mesl_account.trucks
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setTrucks(String trucks) {
        this.trucks = trucks == null ? null : trucks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.stock
     *
     * @return the value of mesl_account.stock
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.stock
     *
     * @param stock the value for mesl_account.stock
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.account_name
     *
     * @return the value of mesl_account.account_name
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.account_name
     *
     * @param accountName the value for mesl_account.account_name
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_account.account_money
     *
     * @return the value of mesl_account.account_money
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public String getAccountMoney() {
        return accountMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_account.account_money
     *
     * @param accountMoney the value for mesl_account.account_money
     * @mbggenerated Thu Jun 27 18:20:00 CST 2019
     */
    public void setAccountMoney(String accountMoney) {
        this.accountMoney = accountMoney == null ? null : accountMoney.trim();
    }
}