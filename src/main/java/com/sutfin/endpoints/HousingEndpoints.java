package com.sutfin.endpoints;

import com.sutfin.entity.HousingEntity;
import com.sutfin.repository.HousingRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;

import java.util.List;

@Path("/mongo-housing")
public class HousingEndpoints {
    @Inject
    HousingRepository housingRepository;



    @GET
    @Path("/get-all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllHouses() {
        List<HousingEntity> response = housingRepository.listAll();
        return Response.ok(response).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response learnMore(@PathParam("id") String id) {
        HousingEntity response = housingRepository.findById(new ObjectId(id));
        return Response.ok(response).build();
    }
}
