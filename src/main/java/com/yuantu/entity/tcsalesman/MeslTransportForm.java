package com.yuantu.entity.tcsalesman;

public class MeslTransportForm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_transport_form.id
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_transport_form.transport_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    private String transportNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_transport_form.expressorder_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    private String expressorderNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_transport_form.id
     *
     * @return the value of mesl_transport_form.id
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_transport_form.id
     *
     * @param id the value for mesl_transport_form.id
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_transport_form.transport_number
     *
     * @return the value of mesl_transport_form.transport_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public String getTransportNumber() {
        return transportNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_transport_form.transport_number
     *
     * @param transportNumber the value for mesl_transport_form.transport_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber == null ? null : transportNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_transport_form.expressorder_number
     *
     * @return the value of mesl_transport_form.expressorder_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public String getExpressorderNumber() {
        return expressorderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_transport_form.expressorder_number
     *
     * @param expressorderNumber the value for mesl_transport_form.expressorder_number
     *
     * @mbggenerated Tue Jul 30 13:33:53 CST 2019
     */
    public void setExpressorderNumber(String expressorderNumber) {
        this.expressorderNumber = expressorderNumber == null ? null : expressorderNumber.trim();
    }
}