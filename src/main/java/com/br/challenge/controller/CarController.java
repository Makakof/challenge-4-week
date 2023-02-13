package com.br.challenge.controller;


import com.br.challenge.dto.CarDtoRequest;
import com.br.challenge.dto.CarDtoResponse;
import com.br.challenge.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController
{
    @Autowired
    private CarService carService;

    @PostMapping("/cars/post")
    public ResponseEntity<CarDtoResponse> save(@RequestBody @Validated CarDtoRequest request)
    {
        CarDtoResponse carDtoResponse = carService.save(request);
        return ResponseEntity.ok(carDtoResponse);
    }

    @GetMapping("/cars/get/{idChassi}")
    public ResponseEntity<CarDtoResponse> getById(@PathVariable Long idChassi)
    {
        CarDtoResponse carDtoResponse = carService.getById(idChassi);
        return ResponseEntity.ok(carDtoResponse);
    }
}
