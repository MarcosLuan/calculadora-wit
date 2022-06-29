package br.com.marcos.rest.resources;

import br.com.marcos.calculadora.dto.CalculadoraDTO;
import br.com.marcos.calculadora.service.CalculadoraService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CalculadoraResource {

    @Inject
    CalculadoraService calculadoraService;

    @GET
    @Path("/soma/{valor1}/{valor2}")
    public void getSomar(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        calculadoraService.somar(valor1, valor2);
    }
}
