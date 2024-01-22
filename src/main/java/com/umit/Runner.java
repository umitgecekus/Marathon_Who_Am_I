package com.umit;


import com.umit.controller.YarismaController;
import com.umit.repository.Default;

public class Runner {
    public static void main(String[] args) {

        Default create = new Default();
        create.createDemoData();
        

    }
}
