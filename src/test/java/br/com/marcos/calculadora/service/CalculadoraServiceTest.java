package br.com.marcos.calculadora.service;

import br.com.marcos.calculadora.dto.CalculadoraDTO;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@Transactional
class CalculadoraServiceTest {

    @Inject
    CalculadoraService calculadoraService;

    @Test
    void somar() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(2D);

        String resultado = calculadoraService.somar(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("O resultado da soma é: 3.0", resultado);
    }

    @Test
    void subtrair() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(2D);

        String resultado = calculadoraService.subtrair(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("O resultado da subtração é: -1.0", resultado);
    }

    @Test
    void multiplicar() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(2D);

        String resultado = calculadoraService.multiplicar(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("O resultado da multiplicação é: 2.0", resultado);
    }

    @Test
    void dividir() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(2D);

        String resultado = calculadoraService.dividir(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("O resultado da divisão é: 0.5", resultado);
    }

    @Test
    void dividirPorZero() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(0D);

        String resultado = calculadoraService.dividir(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("Não é possível dividir por zero!", resultado);
    }

    @Test
    void calcularTodos() {
        CalculadoraDTO dto = new CalculadoraDTO();
        dto.setValor1(1D);
        dto.setValor2(2D);
        String resultado = calculadoraService.calcularTodos(dto.getValor1(), dto.getValor2());
        Assertions.assertEquals("Os resultados são: \n" +
                " O resultado da soma é: 3.0\n" +
                " O resultado da subtração é: -1.0\n" +
                " O resultado da multiplicação é: 2.0\n" +
                " O resultado da divisão é: 0.5", resultado);
    }
}