package com.nun.assessment.repository.impl;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PenjualanItem;
import com.nun.assessment.repository.PenjualanRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PenjualanRepositoryImpl implements PenjualanRepository {
    private final JdbcTemplate jdbcTemplate;

    public PenjualanRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void savePenjualanAndItems(Penjualan penjualan) {
        String insertPenjualanSql = "INSERT INTO penjualan (nama_pelanggan, tanggal, jam, total, bayar_tunai, kembali) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(insertPenjualanSql, penjualan.getNamaPelanggan(), penjualan.getTanggal(), penjualan.getJam(), penjualan.getTotal(), penjualan.getBayarTunai(), penjualan.getKembali());

        String getPenjualanIdSql = "SELECT LAST_INSERT_ID()";
        int penjualanId = jdbcTemplate.queryForObject(getPenjualanIdSql, Integer.class);

        for (PenjualanItem item : penjualan.getItems()) {
            String insertItemSql = "INSERT INTO penjualan_item (penjualan_id, item_id, quantity, harga, sub_total) VALUES (?, ?, ?, ?, ?)";
            jdbcTemplate.update(insertItemSql, penjualanId, item.getItemId(), item.getQuantity(), item.getHarga(), item.getSubTotal());
        }
    }
}
