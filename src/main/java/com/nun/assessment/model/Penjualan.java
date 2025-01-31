package com.nun.assessment.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Penjualan {
    private int id;
    private String namaPelanggan;
    private LocalDate tanggal;
    private LocalTime jam;
    private BigDecimal total;
    private BigDecimal bayarTunai;
    private BigDecimal kembali;

    private List<PenjualanItem> items;

    public Penjualan(){}

    public Penjualan(int id, String namaPelanggan, LocalDate tanggal, LocalTime jam, BigDecimal total, BigDecimal bayarTunai, BigDecimal kembali) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.total = total;
        this.bayarTunai = bayarTunai;
        this.kembali = kembali;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<PenjualanItem> getItems() {
        return items;
    }

    public void setItems(List<PenjualanItem> items) {
        this.items = items;
    }
}
