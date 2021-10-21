package com.currexchange.currencyrate.model;

import lombok.Value;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Value
public class RateData {

    private String base;
    private HashMap<String, BigDecimal> rates;
 //   private long timestamp;

    public String getBase() {
        return base;
    }

    public HashMap<String, BigDecimal> getRates() {
        return rates;
    }
}
