package com.umit.repository;

import com.umit.entity.*;
import com.umit.utility.enums.Cinsiyet;

import java.util.List;

public class Default {
    private final InfoRepository infoRepository;

    private final SoruRepository soruRepository;
    private final UnluRepository unluRepository;
    private final YarismaciRepository yarismaciRepository;
    private final YarismaRepository yarismaRepository;

    public Default() {
        this.infoRepository = new InfoRepository();
        this.soruRepository = new SoruRepository();
        this.unluRepository = new UnluRepository();
        this.yarismaciRepository = new YarismaciRepository();
        this.yarismaRepository = new YarismaRepository();
    }

    public void createDemoData() {
        //UNLU
        unluRepository.save(Unlu.builder()

                .adsoyad("Fatih Terim")
                .imageUrl("https://...")

                .build());
        unluRepository.save(Unlu.builder()

                .adsoyad("Kivanc Tatlitug")
                .imageUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .adsoyad("Arda Turan")
                .imageUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .adsoyad("Acun Ilicali")
                .imageUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .adsoyad("Cansu Dere")
                .imageUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .adsoyad("Turkan Soray")
                .imageUrl("https://...")
                .build());



        //INFO;
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("175")
                .yas("65")
                .kilo("70")
                .memleket("Adana")
                .meslek("Teknik Direktor")
                .bilgi("2000 yilinda avrupa kupasini almistir")
                .gozRengi("Siyah")
                .unluId(1L)

                .build());
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("187")
                .yas("35")
                .kilo("80")
                .memleket("Istanbul")
                .meslek("Oyuncu")
                .bilgi("Cogu kisiye gore Turkiyenin en yakisikli kisisi")
                .gozRengi("Mavi")
                .unluId(2L)
                .build());
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("175")
                .yas("38")
                .kilo("65")
                .memleket("Yozgat")
                .meslek("Sporcu")
                .bilgi("Ispanyada yıllarca top oynayan eski futbolcu")
                .gozRengi("Kahverengi")
                .unluId(3L)
                .build());
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("175")
                .yas("52")
                .kilo("70")
                .memleket("Erzurum")
                .meslek("Is Adami")
                .bilgi("Tv kanali ve futbol takımı sahibi turk is adami")
                .gozRengi("Ela")
                .unluId(4L)
                .build());
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("175")
                .yas("44")
                .kilo("60")
                .memleket("İstanbul")
                .meslek("Oyuncu")
                .bilgi("Ezel dizisinin efsane kadın oyuncusu")
                .gozRengi("Siyah")
                .unluId(5L)
                .build());

        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("168")
                .yas("75")
                .kilo("60")
                .memleket("Ankara")
                .meslek("Oyuncu")
                .bilgi("Al Yazmalım filminin basrol oyuncusu")
                .gozRengi("Kahverengi")
                .unluId(6L)
                .build());
        infoRepository.save(Info.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("175")
                .yas("77")
                .kilo("60")
                .memleket("İstanbul")
                .meslek("Tarihci")
                .bilgi("Turkiyenin en degerli tarihcilerinden biri")
                .gozRengi("Siyah")
                .unluId(7L)
                .build());




        //SORULAR;

        Soru soru1 = new Soru();
        soru1.setPuan("100");
        soru1.setSure("1DK");
        soru1.setUnluId(1L);
        soru1.setInfoId(1L);


        Soru soru2 =new Soru();
        soru2.setPuan("110");
        soru2.setSure("2DK");
        soru2.setUnluId(2L);
        soru2.setInfoId(2L);


        Soru soru3 =new Soru();
        soru3.setPuan("110");
        soru3.setSure("3DK");
        soru3.setUnluId(3L);
        soru3.setInfoId(3L);


        Soru soru4 =new Soru();
        soru4.setPuan("150");
        soru4.setSure("4DK");
        soru4.setUnluId(4L);
        soru4.setInfoId(4L);


        Soru soru5 =new Soru();
        soru5.setPuan("110");
        soru5.setSure("5DK");
        soru5.setUnluId(5L);
        soru5.setInfoId(5L);


        Soru soru6 =new Soru();
        soru6.setPuan("180");
        soru6.setSure("6DK");
        soru6.setUnluId(6L);
        soru6.setInfoId(6L);


        Soru soru7 =new Soru();
        soru7.setPuan("210");
        soru7.setSure("7DK");
        soru7.setUnluId(7L);
        soru7.setInfoId(7L);


        //YARISMACI;

        Yarismaci yarismaci1 = new Yarismaci();
        yarismaci1.setName("Umit");
        yarismaci1.setSurname("Gecekus");
        yarismaci1.setPhone("0555 555 5555");
        yarismaci1.setCinsiyet(Cinsiyet.ERKEK);

        Yarismaci yarismaci2 = new Yarismaci();
        yarismaci2.setName("Ozge");
        yarismaci2.setSurname("Yilmaz");
        yarismaci2.setPhone("0 555 444 4444");
        yarismaci2.setCinsiyet(Cinsiyet.KADIN);


        //YARISMA
        Yarisma yarisma1 = (Yarisma.builder()
                .ad("Genel Kultur")
                        .baslangicTarihi(System.currentTimeMillis())
                        .soruList(List.of(soru1,soru2,soru3))
                        .yarismaciList(List.of(yarismaci1,yarismaci2))
                        .baslangicTarihi(System.currentTimeMillis())
                .build()
        );


        soru1.setYarisma(yarisma1);
        soru2.setYarisma(yarisma1);
        soru3.setYarisma(yarisma1);
        soru4.setYarisma(yarisma1);
        soru5.setYarisma(yarisma1);
        soru6.setYarisma(yarisma1);



        yarismaci1.setYarisma(yarisma1);
        yarismaci2.setYarisma(yarisma1);

        yarismaRepository.save(yarisma1);


    }
}
