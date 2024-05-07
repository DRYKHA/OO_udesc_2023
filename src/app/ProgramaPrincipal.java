package domain;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Pessoa {
    public String nome;
    public String endereço;
    public LocalDate nascimento;
    public BigDecimal salario;

}
package app;

import domain.Pessoa;


import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        fulano.nome = "Fulano da Silva";
        fulano.endereço = "Rua dos programadores, 42";
        fulano.nascimento = LocalDate.of(1990, 10,  13);
        fulano.salario = new BigDecimal("1000.99");

        System.out.println("Nome......: " + fulano.nome);
        System.out.println("Endereço..: " + fulano.endereço);
        System.out.println("Nascimento.: " + fulano.nascimento);
        System.out.println ("Salário....: " + fulano.salario");
    }
}


