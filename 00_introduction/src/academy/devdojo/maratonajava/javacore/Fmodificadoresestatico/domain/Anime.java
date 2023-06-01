package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private static String nome;
    private static int[] episodios;

    // 0 -  Bloco de Incialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado

    static {
        System.out.println("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        Anime.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
