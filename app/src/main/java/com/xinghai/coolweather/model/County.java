package com.xinghai.coolweather.model;

public class County {
    private int id;
    private String CountyName;
    private String CountyCode;
    private int CityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public String getCountyCode() {
        return CountyCode;
    }

    public int getCityId() {
        return CityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public void setCountyCode(String countyCode) {
        CountyCode = countyCode;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
