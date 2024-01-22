package com.umit.service;

import com.umit.controller.YarismaController;
import com.umit.entity.Unlu;
import com.umit.entity.Yarisma;
import com.umit.entity.Yarismaci;
import com.umit.repository.YarismaRepository;
import com.umit.repository.YarismaciRepository;
import java.util.List;

public class YarismaService {

    private YarismaRepository yarismaRepository;
    public static void yarismayiBaslat() {
        List<Yarismaci> yarismaciList = new YarismaciRepository().findAll();
        List<Unlu> unluList = UnluService.randomUnluGetir();

        for (Yarismaci yarismaci : yarismaciList) {
            System.out.println("Yarişmaci...: " + yarismaci.getName()+" "+ yarismaci.getSurname());
            YarismaController.tahmin(yarismaci, unluList);
            yarismaci.getYarisma().setTotalSure(0L);
        }

        Yarismaci kazanan = yarismaciList.get(0);
        for (Yarismaci yarismaci : yarismaciList) {
            if (yarismaci.getYarisma().getTotalSure() > kazanan.getYarisma().getTotalSure()) {
                kazanan = yarismaci;
            }
        }
        System.out.println("Winner..: " + kazanan.getName()+" "+kazanan.getSurname());
    }

    public void save(Yarisma yarisma){
        yarismaRepository.save(yarisma);
    }
    public List<Yarisma> findAll(){
        return yarismaRepository.findAll();
    }


}