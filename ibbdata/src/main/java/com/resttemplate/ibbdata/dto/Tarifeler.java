package com.resttemplate.ibbdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tarifeler {
    @JsonProperty("Tarife")
    private String tarife;
    @JsonProperty("Fiyat")
    private double fiyat;

    public String getTarife() {
        return tarife;
    }

    public void setTarife(String tarife) {
        this.tarife = tarife;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
