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
    @Path("/somar/{valor1}/{valor2}")
    public String getSomar(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        return calculadoraService.somar(valor1, valor2);
    }

    @GET
    @Path("/subtrair/{valor1}/{valor2}")
    public String getSubtrair(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        return calculadoraService.subtrair(valor1, valor2);
    }

    @GET
    @Path("/multiplicar/{valor1}/{valor2}")
    public String getMultiplicar(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        return calculadoraService.multiplicar(valor1, valor2);
    }

    @GET
    @Path("/dividir/{valor1}/{valor2}")
    public String getDividir(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        return calculadoraService.dividir(valor1, valor2);
    }

    @GET
    @Path("/calcular-todos/{valor1}/{valor2}")
    public String getCalcularTodos(@PathParam("valor1") double valor1, @PathParam("valor2") double valor2) {
        return calculadoraService.calcularTodos(valor1, valor2);
    }
}
