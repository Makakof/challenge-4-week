package com.br.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoResponse
{
    private long idCar;
    private String name;
    private String brand;
    private String color;
    private String fabricationYear;
}
