package com.umit.service;

import com.umit.entity.Soru;
import com.umit.repository.SoruRepository;

import java.util.List;

public class SoruService {

    private SoruRepository soruRepository;

    public void save(Soru soru){
        soruRepository.save(soru);
    }
    public List<Soru> findAll(){
        return soruRepository.findAll();
    }
}
