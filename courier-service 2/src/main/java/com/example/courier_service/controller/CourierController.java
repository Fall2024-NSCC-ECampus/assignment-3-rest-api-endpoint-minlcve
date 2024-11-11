package com.example.courier_service.controller;

import com.example.courier_service.model.Courier;
import com.example.courier_service.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/couriers")
public class CourierController {

    @Autowired
    private CourierService courierService;

    @GetMapping
    public List<Courier> getAllCouriers() {
        return courierService.getAllCouriers();
    }

    @GetMapping("/{id}")
    public Optional<Courier> getCourierById(@PathVariable Long id) {
        return courierService.getCourierById(id);
    }

    @PostMapping
    public Courier addCourier(@RequestBody Courier courier) {
        return courierService.addCourier(courier);
    }

    @PutMapping("/{id}")
    public Courier updateCourier(@PathVariable Long id, @RequestBody Courier courier) {
        return courierService.updateCourier(id, courier);
    }

    @DeleteMapping("/{id}")
    public void deleteCourier(@PathVariable Long id) {
        courierService.deleteCourier(id);
    }
}
