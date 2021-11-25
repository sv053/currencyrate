package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Downsized_medium {


    private String url;
    private String width;
    private String height;
    private String size;

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getSize() {
        return size;
    }
}
