package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product{

    public static final double TAX_PER_CENT = 0.50;
    public Computer(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * TAX_PER_CENT ;
    }



}
