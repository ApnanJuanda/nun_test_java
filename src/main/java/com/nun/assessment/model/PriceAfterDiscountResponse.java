package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceAfterDiscountResponse {
    @JsonProperty("total_diskon")
    private Double totalDiskon;

    @JsonProperty("total_harga_setelah_diskon")
    private Double totalHargaSetelahDiskon;

    private String message;

    public Double getTotalDiskon() {
        return totalDiskon;
    }

    public void setTotalDiskon(Double totalDiskon) {
        this.totalDiskon = totalDiskon;
    }

    public Double getTotalHargaSetelahDiskon() {
        return totalHargaSetelahDiskon;
    }

    public void setTotalHargaSetelahDiskon(Double totalHargaSetelahDiskon) {
        this.totalHargaSetelahDiskon = totalHargaSetelahDiskon;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
