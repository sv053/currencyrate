package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Fixed_height_small_still {

    private String url;
    private String width;
    private String height;

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

}
