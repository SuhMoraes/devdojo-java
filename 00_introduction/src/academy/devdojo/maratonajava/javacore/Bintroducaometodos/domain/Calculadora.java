package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {

        System.out.println(32- 10);
    }

    public void multicaDoisNumeros(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {

        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if(num2 != 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void divisaoDeDoisnumeros(double num1, double num2) {
        if(num2 == 0 ){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do Método alteraDoisNumeros");
        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);
    }

    // Array Padrão
    public void somaArry(int[] numeros) {
        int soma = 0;

        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);

    }

    // Varargs
    public void somaVarArgs(int... numeros) { // Não pode colocar os 3 pontinho depois da variavel, se for colocar mais atributos sem deixar o var
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
