package com.resttemplate.ibbdata.controller;

import com.resttemplate.ibbdata.converter.DtoToEntityConverter;
import com.resttemplate.ibbdata.converter.EntityToDtoConverter;
import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.model.Park;
import com.resttemplate.ibbdata.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ParkController {
    @Autowired
    private ParkRepository parkRepository;
    @Autowired
    private EntityToDtoConverter entityToDtoConverter;
    @Autowired
    private DtoToEntityConverter dtoToEntityConverter;

    @GetMapping("/get/parks")
    public ResponseEntity<List<ParkDto>> getAllParks() {
        List<Park> allPark = (List<Park>) parkRepository.findAll();
        List<ParkDto> parkDtos = new ArrayList<>();
        for (Park park : allPark) {
            parkDtos.add(entityToDtoConverter.convertEntityToDto(park));
        }
        return new ResponseEntity<List<ParkDto>>(parkDtos, HttpStatus.OK);
    }


    @GetMapping("/get/park/{id}")
    public ResponseEntity<ParkDto> getParkById(@PathVariable Long id) {
        Park resultPark = parkRepository.findById(id).get();
        return new ResponseEntity<ParkDto>(entityToDtoConverter.convertEntityToDto(resultPark), HttpStatus.OK);
    }


}
