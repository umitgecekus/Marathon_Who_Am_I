package com.umit.service;

import com.umit.entity.Yarismaci;
import com.umit.repository.YarismaciRepository;

import java.util.List;

public class YarismaciService {
    private YarismaciRepository yarismaciRepository;

    public void save(Yarismaci yarismaci){
        yarismaciRepository.save(yarismaci);
    }
    public List<Yarismaci> findAll(){
        return yarismaciRepository.findAll();
    }

}
