package com.br.challenge.service;

import com.br.challenge.CarNotFoundException;
import com.br.challenge.dto.CarDtoRequest;
import com.br.challenge.dto.CarDtoResponse;
import com.br.challenge.entities.CarEntity;
import com.br.challenge.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService
{
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarRepository carRepository;

    public CarDtoResponse save(CarDtoRequest request)
    {
        CarEntity carEntity = modelMapper.map(request, CarEntity.class);
        carRepository.save(carEntity);
        CarDtoResponse carDtoResponse = modelMapper.map(carEntity, CarDtoResponse.class);
        return carDtoResponse;
    }

    public CarDtoResponse getById(Long carId)
    {
        CarEntity carEntity = carRepository.findById(carId).orElseThrow(() ->
                new CarNotFoundException("Car with id: " + carId + " not found"));
        return modelMapper.map(carEntity, CarDtoResponse.class);
    }
}


