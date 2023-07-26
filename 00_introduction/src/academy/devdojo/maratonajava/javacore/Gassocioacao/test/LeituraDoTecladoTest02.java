package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("É par ou ímpar");
        System.out.println("Digite um número: ");
        int num01 = sc.nextInt();

        if(num01 % 2 == 0) {
            System.out.println(num01 + " é par");
        } else {
            System.out.println(num01 + " é ímpar");
        }


    }
}
