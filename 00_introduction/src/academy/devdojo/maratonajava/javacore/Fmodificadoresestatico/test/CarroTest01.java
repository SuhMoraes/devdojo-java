package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro c1 = new Carro("BMW" , 280);
        Carro carro02 =  new Carro("Mercedes", 250);

        Carro.setVelocidadeLimite(190);
       c1.imprime();
       carro02.imprime();
    }
}
