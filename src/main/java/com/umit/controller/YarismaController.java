package com.umit.controller;

import com.umit.entity.Info;
import com.umit.entity.Unlu;
import com.umit.entity.Yarisma;
import com.umit.entity.Yarismaci;
import com.umit.service.InfoService;
import com.umit.service.YarismaService;

import java.util.List;
import java.util.Scanner;

public class YarismaController {

    private YarismaService yarismaService;
    public static void tahmin(Yarismaci yarismaci, List<Unlu> unluList){
        Scanner scanner=new Scanner(System.in);

        Long baslangicZamani =0L;

        for (Unlu unlu: unluList) {
            System.out.println("************ WHO AM I **************");

            List<Info> ipucuList = InfoService.infoGetir(List.of(unlu));
            baslangicZamani= System.currentTimeMillis();
            boolean dogruTahmin=false;
            do {
                System.out.println("Beni bulabilir misin ? ");
                String tahmin=scanner.nextLine();
                Info ipucu=ipucuList.get(0);

                if (unlu.getId().equals(ipucu.getUnluId())){
                    if (tahmin.equalsIgnoreCase(unlu.getAdsoyad())){
                        System.out.println("DOGRU CEVAP ");
                        dogruTahmin=true;
                        break;
                    }else {
                        System.out.println("YANLIS CEVAP :( ");
                    }
                }
            }while (!dogruTahmin);
        }
        Long bitisZamani = System.currentTimeMillis();
        Long yarismaSuresi =  ((bitisZamani - baslangicZamani) / 1000);
        yarismaci.getYarisma().setTotalSure(yarismaSuresi);

    }

    public void save(Yarisma yarisma){
        yarismaService.save(yarisma);
    }
    public List<Yarisma> findAll(){
        return yarismaService.findAll();
    }

}