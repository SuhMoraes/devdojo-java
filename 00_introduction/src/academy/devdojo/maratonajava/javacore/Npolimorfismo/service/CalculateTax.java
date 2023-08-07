package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Legumes;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;

public class CalculateTax {
    public static void calculateTaxComputer(Computer computer) {
        System.out.println("Report Tax Computer");
        double tax = computer.calculateTax();
        System.out.println("Tax computer " + computer.getNome());
        System.out.println("Value " + computer.getValor());
        System.out.println("Tax " + tax);
    }

    public static void calculateTaxComputer(Legumes legumes) {
        System.out.println("Report Tax legumes");
        double tax = legumes.calculateTax();
        System.out.println("Tax legumes " + legumes.getNome());
        System.out.println("Value " + legumes.getValor());
        System.out.println("Tax " + tax);
    }

    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto");
        double imposto = product.calculateTax();
        System.out.println("Produto:" + product.getNome());
        System.out.println("Preço:" + product.getValor());
        System.out.println("Imposto a ser pago:" + product.calculateTax());
    }
}
