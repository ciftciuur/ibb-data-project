package com.resttemplate.ibbdata.dto;

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
}
