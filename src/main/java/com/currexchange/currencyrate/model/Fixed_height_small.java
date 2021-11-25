package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Fixed_height_small {


    private String url;
    private String mp4;
    private String width;
    private String height;
    private String size;
    private String mp4_size;
    private String webp;
    private String webp_size;


    public String getUrl() {
        return url;
    }

    public String getMp4() {
        return mp4;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

}
