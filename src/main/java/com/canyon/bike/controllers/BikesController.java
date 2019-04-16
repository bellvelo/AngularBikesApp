package com.canyon.bike.controllers;


import com.canyon.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> List(){
        List<Bike> bikes = new ArrayList<>();
        return bikes;
    }

    @PostMapping
    @ResponseStatus(HttpStatus. OK)
    public void createBike(@RequestBody Bike bike){
    }

    @GetMapping("/{id}")
    public Bike getBike(@PathVariable("id") long id){
        return new Bike();
    }
}
