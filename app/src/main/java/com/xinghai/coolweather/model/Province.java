package com.xinghai.coolweather.model;


public class Province {
    private int id;
    private String ProvinceName;
    private String ProvinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public String getProvinceCode() {
        return ProvinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public void setProvinceCode(String provinceCode) {
        ProvinceCode = provinceCode;
    }
}
