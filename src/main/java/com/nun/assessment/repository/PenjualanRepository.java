package com.nun.assessment.repository;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PenjualanItem;

import java.util.List;

public interface PenjualanRepository {
    void savePenjualanAndItems(Penjualan penjualan);
}
