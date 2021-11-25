package com.currexchange.currencyrate.apis;

import com.currexchange.currencyrate.model.RateData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "currexchange",url = "https://openexchangerates.org/api")
public interface RatesDataApi {

    @GetMapping("/latest.json")
    RateData getRates(@RequestParam("app_id") String id);

    @GetMapping("/historical/{date}.json")
    RateData getPrevData( @PathVariable("date") String date, @RequestParam("app_id") String id);



}

