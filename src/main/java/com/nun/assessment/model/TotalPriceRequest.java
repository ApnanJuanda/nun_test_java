package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalPriceRequest {
    private Double total;

    @JsonProperty("persen_pajak")
    private Double persenPajak;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPersenPajak() {
        return persenPajak;
    }

    public void setPersenPajak(Double persenPajak) {
        this.persenPajak = persenPajak;
    }
}
