package com.frei.test.springtask.controllers;


import com.frei.test.springtask.interfaces.CarRepository;
import com.frei.test.springtask.objects.Car;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class CarController {


    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Collection<Car> cars(){
        return carRepository.findAll().stream()
                .filter(this::isCars)
                .collect(Collectors.toList());
    }

    private boolean isCars(Car car){
        return !car.getName().equals("AMG Big") &&
                !car.getName().equals("Tiple marge") &&
                !car.getName().equals("Impal fire");
    }
}
