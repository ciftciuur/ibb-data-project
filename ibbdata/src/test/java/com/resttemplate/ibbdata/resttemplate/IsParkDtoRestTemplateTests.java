package com.resttemplate.ibbdata.resttemplate;


import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.dto.ParkDetailDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class IsParkDtoRestTemplateTests {

    private IsParkRestTemplate isParkRestTemplate = new IsParkRestTemplate();


    @Test
    void getParksTest() {
        List<ParkDto> parks = isParkRestTemplate.getParks();
        if (parks.size() > 0) {
            for (ParkDto park : parks) {
                if (park.getParkAdi() != null) {
                    System.out.println("Success !");
                    System.out.println(park.getParkAdi());
                } else {
                    System.out.println("not response record ! ");
                }
            }
        } else {
            System.out.println("Oppss ! ");
        }
    }

    @Test
    void getParkDetailTest() {
        ParkDetailDto detail = isParkRestTemplate.getParkDetail(395);
        if (detail != null) {
            if (detail.getParkAdi() != null)
                System.out.println(detail);
        } else
            System.out.println("not response record");
    }

}
