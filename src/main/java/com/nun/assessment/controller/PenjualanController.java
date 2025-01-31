package com.nun.assessment.controller;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PenjualanItem;
import com.nun.assessment.model.PenjualanItemRequest;
import com.nun.assessment.model.PenjualanRequest;
import com.nun.assessment.model.PenjualanResponse;
import com.nun.assessment.service.PenjualanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class PenjualanController {

    private final PenjualanService penjualanService;

    public PenjualanController(PenjualanService penjualanService) {
        this.penjualanService = penjualanService;
    }

    @PostMapping
    public ResponseEntity<PenjualanResponse> createPenjualan(@RequestBody PenjualanRequest request) {
        Penjualan penjualan = new Penjualan();
        penjualan.setNamaPelanggan(request.getNamaPelanggan());
        penjualan.setTanggal(request.getTanggal());
        penjualan.setJam(request.getJam());
        penjualan.setTotal(request.getTotal());
        penjualan.setBayarTunai(request.getBayarTunai());
        penjualan.setKembali(request.getKembali());

        List<PenjualanItem> penjualanItems = new ArrayList<>();
        for (PenjualanItemRequest itemRequest : request.getItems()) {
            PenjualanItem item = new PenjualanItem();
            item.setItemId(itemRequest.getItemId());
            item.setQuantity(itemRequest.getQuantity());
            item.setHarga(itemRequest.getHarga());
            item.setSubTotal(itemRequest.getSubTotal());

            penjualanItems.add(item);
        }
        penjualan.setItems(penjualanItems);

        try {
            penjualanService.savePenjualanWithItems(penjualan);
            PenjualanResponse response = new PenjualanResponse("Success Save Data Penjualan");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            PenjualanResponse response = new PenjualanResponse("Error: " + e.getMessage());
            return ResponseEntity.status(500).body(response);
        }
    }
}
