package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("New Fiesta","Hatch", 1., 'G', "Ford");
        Carro carro02 = new Carro();
        carro.imprimeDadosCarro();

        carro02.init("Tiida","Hatch", 1.8, 'E');
        carro02.imprimeDadosCarro();
    }

}
