package com.example.dell.searchfoody.model;

import java.io.Serializable;

public class ToaDo implements Serializable {
    private String matram;
    private String tentram;
    private double lat;
    private double lng;

    public String getMatram() {
        return matram;
    }

    public void setMatram(String matram) {
        this.matram = matram;
    }

    public String getTentram() {
        return tentram;
    }

    public void setTentram(String tentram) {
        this.tentram = tentram;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public ToaDo() {

    }

    public ToaDo(String matram, String tentram, double lat, double lng) {

        this.matram = matram;
        this.tentram = tentram;
        this.lat = lat;
        this.lng = lng;
    }
}
