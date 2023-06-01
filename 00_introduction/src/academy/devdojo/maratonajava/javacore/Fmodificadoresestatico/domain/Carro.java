package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Carro {

    private static String nome;
    private static double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public static void imprime() {
        System.out.println("--------------");
        System.out.println("Nome " + Carro.nome);
        System.out.println("Velocidade Máxima " + Carro.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite =  velocidadeLimite;
    }

    public Carro(String nome, double velocidadeMaxima) {
        Carro.nome = nome;
        Carro.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
