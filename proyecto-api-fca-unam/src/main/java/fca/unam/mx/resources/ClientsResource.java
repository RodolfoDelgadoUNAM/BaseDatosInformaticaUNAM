package fca.unam.mx.resources;

import fca.unam.mx.dal.StoreDal;
import fca.unam.mx.dto.ProductDto;
import fca.unam.mx.dto.ClientDto;//Agregue esta importacion
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clients")
public class ClientsResource { //modifique la clase

    @Inject
    StoreDal storeDal;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all clients")//modifique el string
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response getClients() {              //modifique el metodo

        var responseDto = storeDal.getClients();//modifique el metodo
        return Response.ok(responseDto).build();
    }
    //Elimine todo el @POST

}