package com.yuantu.entity.tcstoreman;

public class MeslOutStorehouse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.id
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.expressorder_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private String expressorderNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.out_storehouse_date
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private String outStorehouseDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.destination
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private String destination;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.shipment_method
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private String shipmentMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mesl_out_storehouse.receive_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    private String receiveNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.id
     *
     * @return the value of mesl_out_storehouse.id
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.id
     *
     * @param id the value for mesl_out_storehouse.id
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.expressorder_number
     *
     * @return the value of mesl_out_storehouse.expressorder_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public String getExpressorderNumber() {
        return expressorderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.expressorder_number
     *
     * @param expressorderNumber the value for mesl_out_storehouse.expressorder_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setExpressorderNumber(String expressorderNumber) {
        this.expressorderNumber = expressorderNumber == null ? null : expressorderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.out_storehouse_date
     *
     * @return the value of mesl_out_storehouse.out_storehouse_date
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public String getOutStorehouseDate() {
        return outStorehouseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.out_storehouse_date
     *
     * @param outStorehouseDate the value for mesl_out_storehouse.out_storehouse_date
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setOutStorehouseDate(String outStorehouseDate) {
        this.outStorehouseDate = outStorehouseDate == null ? null : outStorehouseDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.destination
     *
     * @return the value of mesl_out_storehouse.destination
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.destination
     *
     * @param destination the value for mesl_out_storehouse.destination
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.shipment_method
     *
     * @return the value of mesl_out_storehouse.shipment_method
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public String getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.shipment_method
     *
     * @param shipmentMethod the value for mesl_out_storehouse.shipment_method
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod == null ? null : shipmentMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mesl_out_storehouse.receive_number
     *
     * @return the value of mesl_out_storehouse.receive_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public String getReceiveNumber() {
        return receiveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mesl_out_storehouse.receive_number
     *
     * @param receiveNumber the value for mesl_out_storehouse.receive_number
     *
     * @mbggenerated Fri Jun 28 14:39:38 CST 2019
     */
    public void setReceiveNumber(String receiveNumber) {
        this.receiveNumber = receiveNumber == null ? null : receiveNumber.trim();
    }
}