package com.currexchange.currencyrate.apis;

import com.currexchange.currencyrate.model.Data;
import com.currexchange.currencyrate.model.GeneralGif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "currencyrate",url = "https://api.giphy.com/v1/gifs")
public interface GiphyApi {
    @GetMapping("/search")
    GeneralGif getGifs(@RequestParam("api_key") String key,
                       @RequestParam("q") String keyword,
                       @RequestParam("limit") Integer limit,
                       @RequestParam("offset") Integer offset,
                       @RequestParam("rating") String rating,
                       @RequestParam("lang") String lang);
}


