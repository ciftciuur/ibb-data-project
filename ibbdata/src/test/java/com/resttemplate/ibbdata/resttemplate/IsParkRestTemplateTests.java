package com.resttemplate.ibbdata.resttemplate;


import com.resttemplate.ibbdata.dto.Park;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
                    break;
                } else {
                    System.out.println("not response record ! ");
                }
            }
        } else {
            System.out.println("Oppss ! ");
        }
    }
}
