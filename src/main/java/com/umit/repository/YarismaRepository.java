package com.umit.repository;

import com.umit.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long>{
    public YarismaRepository(){
        super(new Yarisma());
    }
}
