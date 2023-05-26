package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Celta";
        carro1.modelo = "1.0 VHC";
        carro1.ano = 2005;

        carro2.nome = "Polo";
        carro2.modelo = "1.0 Highline";
        carro2.ano = 2023;


        carro1 = carro2;

        System.out.println("Carro1 - Nome: " + carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: " + carro1.ano);
        System.out.println("Carro2 - Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);
    }
}
