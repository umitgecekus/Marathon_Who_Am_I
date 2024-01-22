package com.umit.service;

import com.umit.entity.Kazananlar;
import com.umit.repository.KazananlarRepository;

import java.util.List;

public class KazananlarService {
    private KazananlarRepository kazananlarRepository;
    public void save(Kazananlar kazananlar){
        kazananlarRepository.save(kazananlar);
    }
    public List<Kazananlar> findAll(){
        return kazananlarRepository.findAll();
    }
}
