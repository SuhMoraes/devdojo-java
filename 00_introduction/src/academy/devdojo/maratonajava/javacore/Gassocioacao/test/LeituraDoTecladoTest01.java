package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite a sua profissão: ");
        String profissao = sc.nextLine();

        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Profissão: " +profissao);

    }
}
