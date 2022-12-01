package com.springboot.location.entity;

public class Location {
String LocationId;
String LocationName;
Double lat,Lang;

    public Location(String locationId, String locationName, Double lat, Double lang) {
        LocationId = locationId;
        LocationName = locationName;
        this.lat = lat;
        Lang = lang;
    }

    @Override
    public String toString() {
        return "Location{" +
                "LocationId='" + LocationId + '\'' +
                ", LocationName='" + LocationName + '\'' +
                ", lat=" + lat +
                ", Lang=" + Lang +
                '}';
    }

    public String getLocationId() {
        return LocationId;
    }

    public void setLocationId(String locationId) {
        LocationId = locationId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLang() {
        return Lang;
    }

    public void setLang(Double lang) {
        Lang = lang;
    }
}
