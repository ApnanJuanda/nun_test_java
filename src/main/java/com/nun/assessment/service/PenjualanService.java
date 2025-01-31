package com.nun.assessment.service;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PriceAfterDiscountRequest;
import com.nun.assessment.model.PriceAfterDiscountResponse;
import com.nun.assessment.model.TotalPriceRequest;
import com.nun.assessment.model.TotalPriceResponse;

public interface PenjualanService {
    void savePenjualanWithItems(Penjualan penjualan);
    TotalPriceResponse getTotalPriceDetail(TotalPriceRequest request);

    PriceAfterDiscountResponse calculatePriceAfterDiscount(PriceAfterDiscountRequest request);
}
