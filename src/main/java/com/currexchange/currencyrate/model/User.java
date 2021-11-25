package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class User {
    private String username;

    public String getUsername() {
        return username;
    }

}
