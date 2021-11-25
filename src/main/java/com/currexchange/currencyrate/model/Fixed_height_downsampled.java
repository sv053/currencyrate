package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Fixed_height_downsampled {

    private String url;
    private String width;
    private String height;
    private String size;
    private String webp;
    private String webp_size;

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
