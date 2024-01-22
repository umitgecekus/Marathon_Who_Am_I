package com.umit.service;

import com.umit.entity.Unlu;
import com.umit.repository.UnluRepository;

import java.util.Collections;
import java.util.List;
public class UnluService {

    private UnluRepository unluRepository;
    public static List<Unlu> randomUnluGetir(){
        List<Unlu> unluList = new UnluRepository().findAll();
        Collections.shuffle(unluList);
        return unluList;
    }

    public void save(Unlu unlu){
        unluRepository.save(unlu);
    }
    public List<Unlu> findAll(){
        return unluRepository.findAll();
    }

}