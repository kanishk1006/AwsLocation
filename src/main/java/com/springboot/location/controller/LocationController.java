package com.springboot.location.controller;

import com.springboot.location.entity.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LocationController {

    @GetMapping("/")
    public String getDefault(){
        return  "welcome to the AWS code commit";
    }

    @GetMapping("/location")
    public List<Location> getLocation(){
    List<Location> test=new ArrayList<>();
    test.add(new Location("ambernath","mohan suburbia",29.2,45.5));
        test.add(new Location("ambernath 29","mohan suburbia 29",29.2,45.5));
        test.add(new Location("ambernath 31","mohan suburbia 31",29.2,45.5));
    return  test;
    }
}
