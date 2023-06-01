package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador =  new Jogador("Ronaldo");
        Jogador jogador1 =  new Jogador("Cafu");
        Jogador jogador2 =  new Jogador("KAKÁ");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador, jogador1, jogador2};

        jogador.setTime(time);


        System.out.println("--- Time ---");

        time.imprime();

        System.out.println("--- Jogador ---");


        time.setJogadores(jogadores);

        jogador.imprime();
    }
}
