package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Legumes;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("AlienWare", 13000);
        System.out.println(product.getNome());
        System.out.println(product.getValor());
        System.out.println(product.calculateTax());

        Product product1 = new Legumes("Abóbora" , 2.0);
        System.out.println(product1.getNome());
        System.out.println(product1.getValor());
        System.out.println(product1.calculateTax());

    }
}
