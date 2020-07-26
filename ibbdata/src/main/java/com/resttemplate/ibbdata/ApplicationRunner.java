package com.resttemplate.ibbdata;

import com.resttemplate.ibbdata.converter.DtoToEntityConverter;
import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.model.Park;
import com.resttemplate.ibbdata.resttemplate.IsParkRestTemplate;
import com.resttemplate.ibbdata.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Autowired
    private ParkService parkService;
    @Autowired
    private IsParkRestTemplate isParkRestTemplate;

    @Autowired
    private DtoToEntityConverter dtoToEntityConverter;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----- RUN STARTED ---- ");
        List<ParkDto> allParks = isParkRestTemplate.getParks();
        for (ParkDto dto : allParks) {
            parkService.save(dtoToEntityConverter.convertDtoToEntity(dto));
        }
    }
}
