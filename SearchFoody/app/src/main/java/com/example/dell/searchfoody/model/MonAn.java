package com.example.dell.searchfoody.model;

public class MonAn {
    private String id;
    private String name;
    private String idquan;

    public MonAn(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public MonAn() {
    }

    public MonAn(String id, String name, String idquan) {

        this.id = id;
        this.name = name;
        this.idquan = idquan;
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

    public String getIdquan() {
        return idquan;
    }

    public void setIdquan(String idquan) {
        this.idquan = idquan;
    }
}
