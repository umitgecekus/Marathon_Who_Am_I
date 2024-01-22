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
@Table(name = "tbl_kazananlar")
public class Kazananlar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long yarismaList;

    Long yarismaciId;

    String siralama;
}
