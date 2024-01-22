package com.umit.controller;

import com.umit.entity.Soru;
import com.umit.service.SoruService;

import java.util.List;

public class SoruController {
    private SoruService soruService;

    public void save(Soru soru){
        soruService.save(soru);
    }
    public List<Soru> findAll(){
        return soruService.findAll();
    }
}
