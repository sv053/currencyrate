package com.currexchange.currencyrate.controller;

import com.currexchange.currencyrate.apis.GiphyApi;
import com.currexchange.currencyrate.model.GeneralGif;
import com.currexchange.currencyrate.model.RateData;
import com.currexchange.currencyrate.apis.RatesDataApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;

@Slf4j
@Controller

@RequestMapping("")
public class CurrencyController {

    private String rates_app_id;
    private String gif_app_id;
    private RateData todaysRate;
    private RateData prevRate;
    private ArrayList<String> currencyNames;

    public RateData getTodaysRate() {
        return todaysRate;
    }

    public RateData getPrevRate() {
        return prevRate;
    }

    public ArrayList<String> getCurrencyNames() {
        return currencyNames;
    }

    public CurrencyController() {
        rates_app_id = "a24c9f67b4a54d7f99fdff62f39d98af";
        gif_app_id = "3zXla8C9PajUzxu2C3uKgE8BmQ3Ke7tU";
        currencyNames = new ArrayList<>();
    }

    @Autowired
    private RatesDataApi ratesDataApi;
    @Autowired
    private GiphyApi giphyApi;

    private void getRates(){
        todaysRate = ratesDataApi.getRates(rates_app_id);
        prevRate = ratesDataApi.getPrevData(LocalDate.now().minusDays(1).toString(), rates_app_id);
    }

    @GetMapping("/currency_input")
    public String getCurrenciesNames(Model model){
        getRates();
        currencyNames.addAll(todaysRate.getRates().keySet());
        model.addAttribute("curNames", currencyNames);
        return "gif_page";
    }

    @GetMapping("/gif")
    public String selectGif(@RequestParam(required = false) String currency, Model model) {
        String queryWord = "confused";
        if(currencyNames.contains(currency.toUpperCase())){
            if (calculateCrossToRub(currency))
                queryWord = "rich";
            else queryWord = "broke";
        };
        GeneralGif generalGif;
        generalGif = giphyApi.getGifs(gif_app_id, queryWord, 25, 0, "g", "en");
        String urlString = generalGif
                .getData()[new Random().nextInt(24)]
                .getEmbed_url();
        model.addAttribute("pic", urlString);
        return "img";
    }

    public boolean calculateCrossToRub(String cur){
        BigDecimal yestRateOfCurrency = prevRate.getRates().get(cur);
        BigDecimal yestRateOfRub = prevRate.getRates().get("RUB");

        BigDecimal todayRateOfCurrency = todaysRate.getRates().get(cur);
        BigDecimal todayRateOfRub = todaysRate.getRates().get("RUB");

        BigDecimal yestCros = yestRateOfCurrency.divide(yestRateOfRub, 2, RoundingMode.HALF_UP);

        BigDecimal todayCros = todayRateOfCurrency.divide(todayRateOfRub, 2, RoundingMode.HALF_UP);

        return (todayCros.compareTo(yestCros) >= 0);
    }
}

