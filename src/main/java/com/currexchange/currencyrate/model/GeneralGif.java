package com.currexchange.currencyrate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralGif {

    private Data[] data;

    private Meta meta;

    private Pagination pagination;

    public Data[] getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    public Pagination getPagination() {
        return pagination;
    }

}
