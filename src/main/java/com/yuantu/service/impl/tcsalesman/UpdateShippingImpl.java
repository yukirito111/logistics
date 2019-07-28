package com.yuantu.service.impl.tcsalesman;

import com.yuantu.dao.tcsalesman.MeslShippingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateShippingImpl implements com.yuantu.service.tcsalesman.UpdateShipping {
    @Autowired
    MeslShippingMapper meslShippingMapper;

    @Override
    public void updateShippingorderNumber(String shippingorderNumber, Integer id) {
        meslShippingMapper.updateShippingorderNumber(shippingorderNumber, id);
    }

    @Override
    public void updateShippingTime(String shippingTime, Integer id) {
        meslShippingMapper.updateShippingTime(shippingTime, id);
    }

    @Override
    public void updateTrainNumber(String trainNumber, Integer id) {
        meslShippingMapper.updateTrainNumber(trainNumber, id);
    }

    @Override
    public void updateOrigin(String origin, Integer id) {
        meslShippingMapper.updateOrigin(origin, id);
    }

    @Override
    public void updateDestination(String destination, Integer id) {
        meslShippingMapper.updateDestination(destination, id);
    }

    @Override
    public void updateCarriageNumber(String carriageNumber, Integer id) {
        meslShippingMapper.updateCarriageNumber(carriageNumber, id);
    }

    @Override
    public void updateOperator(String operator, Integer id) {
        meslShippingMapper.updateOperator(operator, id);
    }
}
