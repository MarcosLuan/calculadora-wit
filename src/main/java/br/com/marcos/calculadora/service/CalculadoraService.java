package br.com.marcos.calculadora.service;

import br.com.marcos.calculadora.dto.CalculadoraDTO;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

    public CalculadoraDTO somar(double valor1, double valor2) {
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        calculadoraDTO.setValor1(valor1);
        calculadoraDTO.setValor2(valor2);
        calculadoraDTO.setResultado(calculadoraDTO.getValor1() + calculadoraDTO.getValor2());

        return calculadoraDTO;
    }
}
