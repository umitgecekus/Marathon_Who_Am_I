package com.umit.controller;

import com.umit.entity.Info;
import com.umit.service.InfoService;

import java.util.List;

public class InfoController {
    private InfoService infoService;

    public void save(Info info){
        infoService.save(info);
    }
    public List<Info> findAll(){
        return infoService.findAll();
    }
}
