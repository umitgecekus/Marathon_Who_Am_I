package com.umit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    Long baslangicTarihi;
    Long totalSure;
    Long totalPuan;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarisma")
    List<Soru> soruList;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarisma")
    List<Yarismaci> yarismaciList;

}
