package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
