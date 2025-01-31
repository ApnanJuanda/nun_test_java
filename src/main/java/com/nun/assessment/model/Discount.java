package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Discount {

    @JsonProperty("diskon")
    private String discount;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
