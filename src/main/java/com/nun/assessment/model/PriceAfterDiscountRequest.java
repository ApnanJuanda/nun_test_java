package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PriceAfterDiscountRequest {

    private List<Discount> discounts;

    @JsonProperty("total_sebelum_diskon")
    private Double totalSebelumDiskon;

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public Double getTotalSebelumDiskon() {
        return totalSebelumDiskon;
    }

    public void setTotalSebelumDiskon(Double totalSebelumDiskon) {
        this.totalSebelumDiskon = totalSebelumDiskon;
    }
}
