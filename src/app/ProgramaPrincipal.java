package app;

import domain.Pessoa;

public class ProgramaPrincipal {
    public static void main(String[] args) {
      Pessoa fulano = new Pessoa();

      System.out.println(fulano.nome);

          // A linha de baixo acusa erro pois não consegue acessar nome
        System.out.println(fulano.nome);
    }
}
