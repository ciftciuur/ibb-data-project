package com.resttemplate.ibbdata.converter;

import com.resttemplate.ibbdata.dto.ParkDto;
import com.resttemplate.ibbdata.model.Park;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntityConverter {

    public Park convertDtoToEntity(ParkDto dto) {
        Park park = new Park();
        park.setParkId(Long.valueOf(dto.getParkId()));
        park.setParkAdi(dto.getParkAdi());
        park.setLatitude(dto.getLatitude());
        park.setLongitude(dto.getLongitude());
        park.setKapasitesi(dto.getKapasitesi());
        park.setBosKapasite(dto.getBosKapasite());
        park.setParkTipi(dto.getParkTipi());
        park.setIlce(dto.getIlce());
        park.setDistance(dto.getDistance());
        park.setÜcretsizParklanmaDk(dto.getÜcretsizParklanmaDk());
        return park;
    }
}
