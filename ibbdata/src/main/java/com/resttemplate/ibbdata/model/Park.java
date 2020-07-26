package com.resttemplate.ibbdata.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Document
@Data
public class Park {
    @Id
    private Long parkId;

    private String parkAdi;

    private Double latitude;

    private Double longitude;

    private int kapasitesi;

    private int bosKapasite;

    private String parkTipi;

    private String ilce;

    private double distance;

    private int ücretsizParklanmaDk;

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getParkAdi() {
        return parkAdi;
    }

    public void setParkAdi(String parkAdi) {
        this.parkAdi = parkAdi;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getKapasitesi() {
        return kapasitesi;
    }

    public void setKapasitesi(int kapasitesi) {
        this.kapasitesi = kapasitesi;
    }

    public int getBosKapasite() {
        return bosKapasite;
    }

    public void setBosKapasite(int bosKapasite) {
        this.bosKapasite = bosKapasite;
    }

    public String getParkTipi() {
        return parkTipi;
    }

    public void setParkTipi(String parkTipi) {
        this.parkTipi = parkTipi;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getÜcretsizParklanmaDk() {
        return ücretsizParklanmaDk;
    }

    public void setÜcretsizParklanmaDk(int ücretsizParklanmaDk) {
        this.ücretsizParklanmaDk = ücretsizParklanmaDk;
    }
}
