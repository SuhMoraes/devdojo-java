package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Mbappé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
