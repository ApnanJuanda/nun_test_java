package com.nun.assessment.service.impl;

import com.nun.assessment.model.Discount;
import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PriceAfterDiscountRequest;
import com.nun.assessment.model.PriceAfterDiscountResponse;
import com.nun.assessment.model.TotalPriceRequest;
import com.nun.assessment.model.TotalPriceResponse;
import com.nun.assessment.repository.PenjualanRepository;
import com.nun.assessment.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenjualanServiceImpl implements PenjualanService {

    private final PenjualanRepository penjualanRepository;

    @Autowired
    public PenjualanServiceImpl(PenjualanRepository penjualanRepository) {
        this.penjualanRepository = penjualanRepository;
    }

    public void savePenjualanWithItems(Penjualan penjualan) {
        penjualanRepository.savePenjualanAndItems(penjualan);
    }

    @Override
    public TotalPriceResponse getTotalPriceDetail(TotalPriceRequest request) {
        TotalPriceResponse response = new TotalPriceResponse();
        Double netSales = request.getTotal()/ (1 + (request.getPersenPajak()/100));
        Double pajakRp = request.getTotal() - netSales;
        response.setNetSales(netSales);
        response.setPajakRp(pajakRp);

        return response;
    }

    @Override
    public PriceAfterDiscountResponse calculatePriceAfterDiscount(PriceAfterDiscountRequest request) {
        PriceAfterDiscountResponse response = new PriceAfterDiscountResponse();
        Double totalPrice = request.getTotalSebelumDiskon();
        Double totalDiskon = 0.0;

        for (Discount d : request.getDiscounts()) {
            Double discountInt = (double) Integer.parseInt(d.getDiscount());
            Double diskon = totalPrice * (discountInt/100);
            totalDiskon += diskon;
            totalPrice -= diskon;
        }
        response.setTotalDiskon(totalDiskon);
        response.setTotalHargaSetelahDiskon(totalPrice);
        return response;
    }
}
