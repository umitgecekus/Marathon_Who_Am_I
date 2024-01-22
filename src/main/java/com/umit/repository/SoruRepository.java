package com.umit.repository;

import com.umit.entity.Soru;

public class SoruRepository extends RepositoryManager<Soru,Long>{
    public SoruRepository(){
        super(new Soru());
    }
}
