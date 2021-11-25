package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Fixed_height {
    private String url;
    private String mp4;
    private String width;
    private String height;
    private String size;

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

    public String getSize() {
        return size;
    }

    public String getMp4_size() {
        return mp4_size;
    }

    public String getWebp() {
        return webp;
    }

    public String getWebp_size() {
        return webp_size;
    }

    private String mp4_size;
    private String webp;
    private String webp_size;
}
