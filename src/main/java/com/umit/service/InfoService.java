package com.umit.service;

import com.umit.entity.Info;
import com.umit.entity.Unlu;
import com.umit.repository.InfoRepository;

import java.util.ArrayList;
import java.util.List;

public class InfoService {
    private InfoRepository infoRepository;
    public static List<Info> infoGetir(List<Unlu> unluList){
        List<Info>  ipucuList = new InfoRepository().findAll();
        List<Info> ipucuListesi=new ArrayList<>();

        for (Unlu unlu : unluList) {
            Info info = ipucuList.stream().filter(x -> x.getId().equals(unlu.getId())).findFirst().orElse(null);
            if (info != null) {
                System.out.println("********** İPUÇLARI *********");
                System.out.println("Cinsiyet " +info.getCinsiyet());
                System.out.println("Yas " +info.getYas());
                System.out.println("Memleket " +info.getMemleket());
                System.out.println("Boy "+info.getBoy());
                System.out.println("Meslek " +info.getMeslek());
                System.out.println("Goz Rengi "+info.getGozRengi());
                System.out.println("Bilgi " +info.getBilgi());
                System.out.println("*****************************");
                ipucuListesi.add(info);
            }

        }
        return ipucuListesi;
    }

    public void save(Info info){
        infoRepository.save(info);
    }
    public List<Info> findAll(){
        return infoRepository.findAll();
    }

}