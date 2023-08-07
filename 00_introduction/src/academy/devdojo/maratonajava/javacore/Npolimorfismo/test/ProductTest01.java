package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Legumes;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculateTax;

public class ProductTest01 {
    public static void main(String[] args) {

        Computer computer = new Computer("Alienware" , 11800.00);
        Legumes legumes = new Legumes("Chuchu" , 8.59);
        CalculateTax.calculateTaxComputer(legumes);
        System.out.println("-------------------------------------------");
        CalculateTax.calculateTaxComputer(computer);
        CalculateTax.calculateTax(computer);
    }
}
