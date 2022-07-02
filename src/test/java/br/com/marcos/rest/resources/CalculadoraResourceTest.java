package br.com.marcos.rest.resources;

import br.com.marcos.calculadora.dto.CalculadoraDTO;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@Transactional
class CalculadoraResourceTest {

    @Test
    void getSomar() {
        given().when()
                .contentType(MediaType.APPLICATION_JSON)
                .get("/calculadora/somar/1/2")
                .then()
                .statusCode(200);
    }

    @Test
    void getSubtrair() {
        given().when()
                .contentType(MediaType.APPLICATION_JSON)
                .get("/calculadora/subtrair/1/2")
                .then()
                .statusCode(200);
    }

    @Test
    void getMultiplicar() {
        given().when()
                .contentType(MediaType.APPLICATION_JSON)
                .get("/calculadora/multiplicar/1/2")
                .then()
                .statusCode(200);
    }

    @Test
    void getDividir() {
        given().when()
                .contentType(MediaType.APPLICATION_JSON)
                .get("/calculadora/dividir/1/2")
                .then()
                .statusCode(200);
    }

    @Test
    void getCalcularTodos() {
        given().when()
                .contentType(MediaType.APPLICATION_JSON)
                .get("/calculadora/calcular-todos/1/2")
                .then()
                .statusCode(200);
    }
}