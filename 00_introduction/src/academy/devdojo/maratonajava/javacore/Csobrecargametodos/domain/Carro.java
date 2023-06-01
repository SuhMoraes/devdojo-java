package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Carro {
    private String tipo;
    private String nome;
    private double motor;
    private char combustivel;

    //Construtor - Vazio
    public Carro() {
    }

    //Construtor - com Parâmetros
    public Carro(String nome, String tipo, double motor, char combustível) {
        this.nome = nome;
        this.tipo = tipo;
        this.motor = motor;
        this.combustivel = combustivel;
    }

    // Mwtodos
    public void init(String nome, String tipo, double motor, char combustível) {
        this.nome = nome;
        this.tipo = tipo;
        this.motor = motor;
        this.combustivel = combustível;
    }

    public void setCombustível(char combustível) {
        this.combustivel = combustível;
    }

    public char getCombustível() {
        return combustivel;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMotor(double motor){
        this.motor = motor;
    }

    public double getMotor() {
        return motor;
    }

    public void imprimeDadosCarro() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.motor);
        System.out.println(this.combustivel);
    }
}
