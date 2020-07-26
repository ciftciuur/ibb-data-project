package com.resttemplate.ibbdata.converter;

import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.model.Park;
import org.springframework.stereotype.Component;

@Component
public class EntityToDtoConverter {

    public ParkDto convertEntityToDto(Park park) {
        ParkDto dto = new ParkDto();
        dto.setParkId(park.getParkId().intValue());
        dto.setParkAdi(park.getParkAdi());
        dto.setLatitude(park.getLatitude());
        dto.setLongitude(park.getLongitude());
        dto.setKapasitesi(park.getKapasitesi());
        dto.setBosKapasite(park.getBosKapasite());
        dto.setParkTipi(park.getParkTipi());
        dto.setIlce(park.getIlce());
        dto.setDistance(park.getDistance());
        dto.setÜcretsizParklanmaDk(park.getÜcretsizParklanmaDk());
        return dto;
    }
}
