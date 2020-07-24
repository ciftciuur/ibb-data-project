package com.resttemplate.ibbdata.resttemplate;


import com.resttemplate.ibbdata.dto.Park;
import com.resttemplate.ibbdata.dto.ParkDetail;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
public class IsParkRestTemplateTests {

    private IsParkRestTemplate isParkRestTemplate = new IsParkRestTemplate();


    @Test
    void getParksTest() {
        List<Park> parks = isParkRestTemplate.getParks();
        if (parks.size() > 0) {
            for (Park park : parks) {
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
        ParkDetail detail = isParkRestTemplate.getParkDetail(395);
        if (detail != null) {
            if (detail.getParkAdi() != null)
                System.out.println(detail);
        } else
            System.out.println("not response record");
    }

}
