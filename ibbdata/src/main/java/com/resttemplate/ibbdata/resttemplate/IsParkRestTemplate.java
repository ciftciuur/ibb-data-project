package com.resttemplate.ibbdata.resttemplate;

import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.dto.ParkDetailDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IsParkRestTemplate {

    private String urlDomain = "https://api.ibb.gov.tr/ispark/";
    RestTemplate restTemplate = new RestTemplate();


    public List<ParkDto> getParks() {
        ResponseEntity<List<ParkDto>> parkResponse =
                restTemplate.exchange(urlDomain + "Park",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<ParkDto>>() {
                        });
        if (parkResponse != null && parkResponse.hasBody()) {
            return parkResponse.getBody();
        } else
            return new ArrayList<ParkDto>();
    }

    public ParkDetailDto getParkDetail(int parkId) {
        return restTemplate.getForEntity(urlDomain + "ParkDetay?id=" + parkId, ParkDetailDto.class).getBody();
    }
}
