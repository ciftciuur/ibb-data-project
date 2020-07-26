package com.resttemplate.ibbdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkDto {
    //Park Id bilgisini içerir.
    //Unique alandır
    @JsonProperty("ParkId")
    private int parkId;
    //park adını içerir
    @JsonProperty("ParkAdi")
    private String parkAdi;
    //park enlem bilgisi
    @JsonProperty("Latitude")
    private Double latitude;
    //park boylam bilgisi
    @JsonProperty("Longitude")
    private Double longitude;
    //park toplam kapasite
    @JsonProperty("Kapasitesi")
    private int kapasitesi;
    //park bos kapasite
    @JsonProperty("BosKapasite")
    private int bosKapasite;
    //park tipi(yol ustu,acik,kapali)
    @JsonProperty("ParkTipi")
    private String parkTipi;
    //parkin bulundugu ilce
    @JsonProperty("Ilce")
    private String ilce;
    //parka olan mesafe
    @JsonProperty("Distance")
    private double distance;
    //ücretsiz parklanma süresi
    @JsonProperty("UcretsizParklanmaDk")
    private int ücretsizParklanmaDk;

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
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
