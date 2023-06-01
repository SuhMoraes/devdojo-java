package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 =  new Jogador("Ronaldo");
        Time time = new Time("Corinthians");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
