package com.umit.repository;

import com.umit.entity.Info;

public class InfoRepository extends RepositoryManager<Info,Long> {
    public InfoRepository(){
        super(new Info());
    }
}
