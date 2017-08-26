package com.acme;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Api
@Path("/echo")
public class EchoRestService {

    @ApiOperation(value = "Echoes message back")
    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String msg) {
        String result = "Echoing: " + msg;
        return Response.status(200).entity(result).build();
    }

}