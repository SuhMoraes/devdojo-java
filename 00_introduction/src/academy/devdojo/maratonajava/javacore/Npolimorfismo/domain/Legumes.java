package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Legumes extends Product{
    public static final double TAX_PER_CENT = 0.18;
    public Legumes(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando o imposto do Legumes");
        return this.valor * TAX_PER_CENT;
    }
}
