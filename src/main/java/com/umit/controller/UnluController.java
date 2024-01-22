package com.umit.controller;

import com.umit.entity.Unlu;
import com.umit.service.UnluService;


import java.util.List;

public class UnluController {
    private UnluService unluService;

    public void save(Unlu unlu){
        unluService.save(unlu);
    }
    public List<Unlu> findAll(){
        return unluService.findAll();
    }
}
