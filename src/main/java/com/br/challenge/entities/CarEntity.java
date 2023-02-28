package com.br.challenge.entities;

import com.br.challenge.BrandEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "CAR")
@Entity
public class CarEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChassi;
    @Column(name = "NAMECAR")
    private String name;
    @Column(name = "BRAND")
    @Enumerated(EnumType.STRING)
    private BrandEnum brandEnum;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "FABRICATION_YEAR")
    private String fabricationYear;
}


