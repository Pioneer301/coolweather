package com.xinghai.coolweather.model;

public class City {
    private int id;
    private String CityName;
    private String CityCode;
    private int ProvinceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return CityName;
    }

    public String getCityCode() {
        return CityCode;
    }

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setCityCode(String cityCode) {
        CityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }
}
