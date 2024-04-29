package com.sutfin.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "housingLocations")
public class HousingEntity extends PanacheMongoEntity {
    private String name;
    private String city;
    private String state;
    private String photo;
    private Long availableUnits;
    private Boolean wifi;
    private Boolean laundry;

    public HousingEntity() {

    }

    @JsonCreator
    public HousingEntity(

                         String name,
                         String city,
                         String state,
                         String photo,
                         Long availableUnits,
                         Boolean wifi,
                         Boolean laundry) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.photo = photo;
        this.availableUnits = availableUnits;
        this.wifi = wifi;
        this.laundry = laundry;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(Long availableUnits) {
        this.availableUnits = availableUnits;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getLaundry() {
        return laundry;
    }

    public void setLaundry(Boolean laundry) {
        this.laundry = laundry;
    }
}
