package com.currexchange.currencyrate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private String type;

    private String id;

    private String slug;

    private String url;

    private String bitly_url;

    private String embed_url;

    private String username;

    private String source;

    private String rating;

    private String caption;

    private String content_url;

    private String source_tld;

    private String source_post_url;

    private String update_datetime;

    private String create_datetime;

    private String import_datetime;

    private String trending_datetime;

    private Images images;

   // private User user;

    private String title;

}
