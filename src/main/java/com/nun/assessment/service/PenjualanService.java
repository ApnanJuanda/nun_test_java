package com.nun.assessment.service;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PenjualanItem;
import com.nun.assessment.repository.PenjualanRepository;

import java.util.List;

public interface PenjualanService {
    void savePenjualanWithItems(Penjualan penjualan);
}
