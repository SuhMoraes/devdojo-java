package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println(" Finalizando Calculadora \n");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Calculadora\n ");
        calculadora.multicaDoisNumeros(20,5);

    }
}
