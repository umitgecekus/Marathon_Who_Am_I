package com.umit.repository;

import com.umit.entity.Unlu;

public class UnluRepository extends RepositoryManager<Unlu,Long>{
    public UnluRepository(){
        super(new Unlu());
    }
}
