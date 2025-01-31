package com.nun.assessment.service.impl;

import com.nun.assessment.model.Penjualan;
import com.nun.assessment.model.PenjualanItem;
import com.nun.assessment.repository.PenjualanRepository;
import com.nun.assessment.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
