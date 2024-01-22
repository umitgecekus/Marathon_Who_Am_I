package com.umit.entity;

import com.umit.utility.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_info")
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JoinColumn(name = "unlu_id")
    Long unluId;
    @OneToOne
    Soru soru;
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;
    String memleket;
    String yas;
    String meslek;
    String boy;
    String kilo;
    String gozRengi;
    String bilgi;

}
