package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros02(42,3);
        System.out.println( calculadora.divideDoisNumeros(20,5));
        System.out.println(result);

        System.out.println("------------------");

        System.out.println(calculadora.divideDoisNumeros(20, 5));

    }
}
