package com.umit.controller;

import com.umit.entity.Yarismaci;
import com.umit.service.YarismaciService;

import java.util.List;

public class YarismaciController {

    private YarismaciService yarismaciService;

    public void save(Yarismaci yarismaci){
        yarismaciService.save(yarismaci);
    }
    public List<Yarismaci> findAll(){
        return yarismaciService.findAll();
    }

}
