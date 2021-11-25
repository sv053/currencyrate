package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Original {


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

    public String getSize() {
        return size;
    }

    public String getMp4() {
        return mp4;
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

    public String getFrames() {
        return frames;
    }

    private String height;
    private String size;
    private String mp4;
    private String mp4_size;
    private String webp;
    private String webp_size;
    private String frames;



}
