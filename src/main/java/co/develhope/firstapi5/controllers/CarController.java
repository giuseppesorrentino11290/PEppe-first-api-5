package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
@Validated
public class CarController {

    @GetMapping
    public CarDTO getCar() {
        CarDTO carDTO = new CarDTO();
        carDTO.setId("1");
        carDTO.setModelName("Tesla Model S");
        carDTO.setPrice(75000.00);
        return carDTO;
    }

    @PostMapping
    public ResponseEntity<String> createCar(@RequestBody @Validated CarDTO carDTO) {
        System.out.println("Car Body: " + carDTO.toString());
        return new ResponseEntity<>("Car creata con successo!", HttpStatus.CREATED);
    }
}