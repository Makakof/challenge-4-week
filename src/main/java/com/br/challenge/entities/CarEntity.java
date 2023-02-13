package com.br.challenge.entities;

import com.br.challenge.Brand;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "CARROS")
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
    private Brand brand;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "FABRICATIONYEAR")
    private String fabricationYear;
}


