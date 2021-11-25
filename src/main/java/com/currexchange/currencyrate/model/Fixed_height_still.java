package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Fixed_height_still {
    private String url;
    private String width;

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    private String height;
}
