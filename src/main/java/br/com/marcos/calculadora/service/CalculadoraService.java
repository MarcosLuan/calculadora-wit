package br.com.marcos.calculadora.service;

import br.com.marcos.calculadora.dto.CalculadoraDTO;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

//    Função somar
    public String somar(double valor1, double valor2) {
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        calculadoraDTO.setValor1(valor1);
        calculadoraDTO.setValor2(valor2);
        calculadoraDTO.setResultado(calculadoraDTO.getValor1() + calculadoraDTO.getValor2());

        return "O resultado da soma é: " + calculadoraDTO.getResultado();
    }

//    Função subtrair
    public String subtrair(double valor1, double valor2) {
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        calculadoraDTO.setValor1(valor1);
        calculadoraDTO.setValor2(valor2);
        calculadoraDTO.setResultado(calculadoraDTO.getValor1() - calculadoraDTO.getValor2());

        return "O resultado da subtração é: " + calculadoraDTO.getResultado();
    }

//    Função multiplicar
    public String multiplicar(double valor1, double valor2) {
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        calculadoraDTO.setValor1(valor1);
        calculadoraDTO.setValor2(valor2);
        calculadoraDTO.setResultado(calculadoraDTO.getValor1() * calculadoraDTO.getValor2());

        return "O resultado da multiplicação é: " + calculadoraDTO.getResultado();
    }

//    Função dividir
    public String dividir(double valor1, double valor2) {
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        calculadoraDTO.setValor1(valor1);
        calculadoraDTO.setValor2(valor2);
        if (valor2 != 0){
            calculadoraDTO.setResultado(calculadoraDTO.getValor1() / calculadoraDTO.getValor2());
            return "O resultado da divisão é: " + calculadoraDTO.getResultado();
        }

        return "Não é possível dividir por zero!";
    }

//    Função para todas os calculos em um unico rest
    public String calcularTodos(double valor1, double valor2) {
        String resultado = "\n " + this.somar(valor1, valor2)
                + "\n " + this.subtrair(valor1, valor2)
                + "\n " + this.multiplicar(valor1, valor2)
                + "\n " + this.dividir(valor1, valor2);

        return "Os resultados são: " + resultado;
    }
}
