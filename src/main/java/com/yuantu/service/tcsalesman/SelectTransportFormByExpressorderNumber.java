package com.yuantu.service.tcsalesman;

import com.yuantu.entity.tcsalesman.MeslTransportForm;

public interface SelectTransportFormByExpressorderNumber {
    MeslTransportForm selectTransportFormByExpressorderNumber(String expressorderNumber);
}
