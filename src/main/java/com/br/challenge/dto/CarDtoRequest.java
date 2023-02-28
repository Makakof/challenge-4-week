package com.br.challenge.dto;
import com.br.challenge.BrandEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoRequest
{
    @NotBlank
    private String name;
    private BrandEnum brandEnum;
    @NotBlank
    private String color;
    @NotBlank
    private String fabricationYear;
}
