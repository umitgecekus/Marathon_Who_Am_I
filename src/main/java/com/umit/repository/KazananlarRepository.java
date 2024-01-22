package com.umit.repository;

import com.umit.entity.Kazananlar;

public class KazananlarRepository extends RepositoryManager<Kazananlar,Long>{
    public KazananlarRepository(){
        super(new Kazananlar());
    }
}
