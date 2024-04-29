package com.sutfin.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "listingsAndReviews")
public class AirBNBEntity {
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private Object last_scraped;






}
