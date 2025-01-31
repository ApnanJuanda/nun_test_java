package com.nun.assessment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PenjualanRequest {
    @JsonProperty("nama_pelanggan")
    private String namaPelanggan;

    private LocalDate tanggal;
    private LocalTime jam;

    private BigDecimal total;

    @JsonProperty("bayar_tunai")
    private BigDecimal bayarTunai;

    private BigDecimal kembali;

    private List<PenjualanItemRequest> items;

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getBayarTunai() {
        return bayarTunai;
    }

    public void setBayarTunai(BigDecimal bayarTunai) {
        this.bayarTunai = bayarTunai;
    }

    public BigDecimal getKembali() {
        return kembali;
    }

    public void setKembali(BigDecimal kembali) {
        this.kembali = kembali;
    }

    public List<PenjualanItemRequest> getItems() {
        return items;
    }

    public void setItems(List<PenjualanItemRequest> items) {
        this.items = items;
    }
}
