package com.currexchange.currencyrate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.util.ArrayList;
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Gif {
    private String id;
    private String type;
    private String title;
    private String url;
    private String source;
    private ArrayList<Images> images;
    private User user;

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Images> getImages() {
        return images;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getSource() {
        return source;
    }

    public String getId() {
        return id;
    }

}
