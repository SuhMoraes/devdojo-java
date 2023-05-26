package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio.domain.Funcionario;

public class Funcionanario001 {

    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Raíssa");
        funcionario01.setIdade(32);
        funcionario01.setSalarios(new double[]{1200, 2400, 5000});

        funcionario01.imprimirDados();
        System.out.println("----------------------");


    }
}
