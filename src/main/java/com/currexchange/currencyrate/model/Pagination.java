package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Pagination {
    private Integer total_count;
    private Integer count;
    private Integer offset;


}
