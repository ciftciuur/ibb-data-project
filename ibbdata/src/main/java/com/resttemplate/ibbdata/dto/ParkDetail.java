package com.resttemplate.ibbdata.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkDetail {


    @JsonProperty("ParkID")
    private int parkId;
    @JsonProperty("ParkAdi")
    private String parkAdi;
    @JsonProperty("Latitude")
    private double latitude;
    @JsonProperty("Longitude")
    private double longitude;
    @JsonProperty("Kapasitesi")
    private int kapasite;
    @JsonProperty("BosKapasite")
    private int bosKapasite;
    @JsonProperty("ParkTipi")
    private String parkTipi;
    @JsonProperty("Ilce")
    private String ilce;
    @JsonProperty("GuncellemeTarihi")
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime güncellemeTarihi;
    @JsonProperty("CalismaSaatleri")
    private String calismaSaatleri;
    @JsonProperty("UcretsizParklanmaDk")
    private int ücretsizParklanmaDk;
    @JsonProperty("AylikAbonelikUcreti")
    private double aylikAbonelikUcreti;
    @JsonProperty("Adres")
    private String adres;
    @JsonProperty("AreaPolygon")
    private List<double[][]> areaPolygon;
    @JsonProperty("Tarifeler")
    private List<Tarifeler> tarifeler;
    @JsonProperty("LokasyonAdi")
    private String lokasyonAdi;

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
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

    public LocalDateTime getGüncellemeTarihi() {
        return güncellemeTarihi;
    }

    public void setGüncellemeTarihi(LocalDateTime güncellemeTarihi) {
        this.güncellemeTarihi = güncellemeTarihi;
    }

    public String getCalismaSaatleri() {
        return calismaSaatleri;
    }

    public void setCalismaSaatleri(String calismaSaatleri) {
        this.calismaSaatleri = calismaSaatleri;
    }

    public int getÜcretsizParklanmaDk() {
        return ücretsizParklanmaDk;
    }

    public void setÜcretsizParklanmaDk(int ücretsizParklanmaDk) {
        this.ücretsizParklanmaDk = ücretsizParklanmaDk;
    }

    public double getAylikAbonelikUcreti() {
        return aylikAbonelikUcreti;
    }

    public void setAylikAbonelikUcreti(double aylikAbonelikUcreti) {
        this.aylikAbonelikUcreti = aylikAbonelikUcreti;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<double[][]> getAreaPolygon() {
        return areaPolygon;
    }

    public void setAreaPolygon(List<double[][]> areaPolygon) {
        this.areaPolygon = areaPolygon;
    }

    public List<Tarifeler> getTarifeler() {
        return tarifeler;
    }

    public void setTarifeler(List<Tarifeler> tarifeler) {
        this.tarifeler = tarifeler;
    }

    public String getLokasyonAdi() {
        return lokasyonAdi;
    }

    public void setLokasyonAdi(String lokasyonAdi) {
        this.lokasyonAdi = lokasyonAdi;
    }
}
