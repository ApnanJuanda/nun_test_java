package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TotalPriceResponse {
    @JsonProperty("net_sales")
    private Double netSales;

    @JsonProperty("pajak_rp")
    private Double pajakRp;

    private String message;

    public Double getNetSales() {
        return netSales;
    }

    public void setNetSales(Double netSales) {
        this.netSales = netSales;
    }

    public Double getPajakRp() {
        return pajakRp;
    }

    public void setPajakRp(Double pajakRp) {
        this.pajakRp = pajakRp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
