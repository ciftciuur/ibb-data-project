package com.resttemplate.ibbdata.resttemplate;

import com.resttemplate.ibbdata.dto.Park;
import com.resttemplate.ibbdata.dto.ParkDetail;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IsParkRestTemplate {


    public List<Park> getParks() {
        String url = "https://api.ibb.gov.tr/ispark/Park";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Park>> parkResponse =
                restTemplate.exchange(url,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Park>>() {
                        });
        if (parkResponse != null && parkResponse.hasBody()) {
            return parkResponse.getBody();
        } else
            return new ArrayList<Park>();
    }

    public ParkDetail getParkDetail(int parkId) {
        String url = "https://api.ibb.gov.tr/ispark/ParkDetay?id=" + parkId;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url, ParkDetail.class).getBody();
    }
}
