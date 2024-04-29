package com.sutfin.repository;

import com.sutfin.entity.HousingEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HousingRepository implements PanacheMongoRepository<HousingEntity> {

    public HousingRepository() {

    }
}
