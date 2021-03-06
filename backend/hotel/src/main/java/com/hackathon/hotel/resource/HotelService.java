package com.hackathon.hotel.resource;

import com.hackathon.hotel.beans.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface HotelService {

    @GetMapping("/fetchHotelDetails")
    public List<Hotel> fetchHotelDetails();

}
