package com.umit.repository;

import com.umit.entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long>{
    public YarismaciRepository(){
        super(new Yarismaci());
    }
}
