package com.yuantu.service.tcsalesman;

public interface UpdateShipping {
    void updateShippingorderNumber(String shippingorderNumber, Integer id);

    void updateShippingTime(String shippingTime, Integer id);

    void updateTrainNumber(String trainNumber, Integer id);

    void updateOrigin(String origin, Integer id);

    void updateDestination(String destination, Integer id);

    void updateCarriageNumber(String carriageNumber, Integer id);

    void updateOperator(String operator, Integer id);
}
