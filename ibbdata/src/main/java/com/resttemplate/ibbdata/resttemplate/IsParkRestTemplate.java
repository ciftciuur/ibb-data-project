package com.resttemplate.ibbdata.resttemplate;

import com.resttemplate.ibbdata.dto.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IsParkRestTemplate {

    private RestTemplate restTemplate;

    String url = "https://api.ibb.gov.tr/ispark/Park";

    public List<Park> getParks() {
        //TODO : kayıt yok api'ye ulaşıyor apiden dönen kayıt sayısı doğru fakat kayıtları almıyor
        if (restTemplate == null)
            restTemplate = new RestTemplate();
        ResponseEntity<List<Park>> parkResponse =
                restTemplate.exchange(url,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Park>>() {
                        });
        if (parkResponse != null && parkResponse.hasBody()) {
            return parkResponse.getBody();
        } else
            return new ArrayList<Park>();
    }
}
