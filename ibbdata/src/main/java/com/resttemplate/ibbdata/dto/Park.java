package com.resttemplate.ibbdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Park {

    //Park Id bilgisini içerir.
    //Unique alandır
    private int ParkID;

    //park adını içerir
    private String ParkAdi;
    //park enlem bilgisi
    private double Latitude;
    //park boylam bilgisi
    private double Longitude;
    //park toplam kapasite
    private int Kapasitesi;
    //park bos kapasite
    private int BosKapasite;
    //park tipi(yol ustu,acik,kapali)
    private String ParkTipi;
    //parkin bulundugu ilce
    private String Ilce;
    //parka olan mesafe
    private double Distance;
    //ücretsiz parklanma süresi
    private int UcretsizParklanmaDk;

    public int getParkID() {
        return ParkID;
    }

    public void setParkID(int parkID) {
        ParkID = parkID;
    }

    public String getParkAdi() {
        return ParkAdi;
    }

    public void setParkAdi(String parkAdi) {
        ParkAdi = parkAdi;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public int getKapasitesi() {
        return Kapasitesi;
    }

    public void setKapasitesi(int kapasitesi) {
        Kapasitesi = kapasitesi;
    }

    public int getBosKapasite() {
        return BosKapasite;
    }

    public void setBosKapasite(int bosKapasite) {
        BosKapasite = bosKapasite;
    }

    public String getParkTipi() {
        return ParkTipi;
    }

    public void setParkTipi(String parkTipi) {
        ParkTipi = parkTipi;
    }

    public String getIlce() {
        return Ilce;
    }

    public void setIlce(String ilce) {
        Ilce = ilce;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
    }

    public int getUcretsizParklanmaDk() {
        return UcretsizParklanmaDk;
    }

    public void setUcretsizParklanmaDk(int ucretsizParklanmaDk) {
        UcretsizParklanmaDk = ucretsizParklanmaDk;
    }
}
