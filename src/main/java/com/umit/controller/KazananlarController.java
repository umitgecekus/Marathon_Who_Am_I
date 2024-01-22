package com.umit.controller;

import com.umit.entity.Kazananlar;
import com.umit.service.KazananlarService;

import java.util.List;

public class KazananlarController {
    private KazananlarService kazananlarService;

    public void save(Kazananlar kazananlar){
        kazananlarService.save(kazananlar);
    }
    public List<Kazananlar> findAll(){
        return kazananlarService.findAll();
    }
}
