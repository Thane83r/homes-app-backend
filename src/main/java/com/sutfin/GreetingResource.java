package com.sutfin;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/bye-bye")
    @Produces(MediaType.TEXT_PLAIN)
    public String bitch() {
        return "Bye from RESTEasy Reactive";
    }
}
