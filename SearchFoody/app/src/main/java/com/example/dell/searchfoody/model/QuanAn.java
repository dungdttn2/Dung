package com.example.dell.searchfoody.model;

import java.io.Serializable;

public class QuanAn implements Serializable {
    private String id;
    private String name;
    private String sdt;
    private String address;
    private String loai;
    private double lat;
    private double lng;
    private int imagePosition;

    public QuanAn(String id, String name, String sdt, String address, String loai, double lat, double lng, int imagePosition) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.address = address;
        this.loai = loai;
        this.lat = lat;
        this.lng = lng;
        this.imagePosition = imagePosition;
    }

    public QuanAn() {
    }

    public QuanAn(String id, String name, String sdt, String address, String loai) {

        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.address = address;
        this.loai = loai;
    }

    public QuanAn(String id, String name, String sdt, String address, String loai, double lat, double lng) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.address = address;
        this.loai = loai;
        this.lat = lat;
        this.lng = lng;
    }

    public int getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(int imagePosition) {
        this.imagePosition = imagePosition;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
