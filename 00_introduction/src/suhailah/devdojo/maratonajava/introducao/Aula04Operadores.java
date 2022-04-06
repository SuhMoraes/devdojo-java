package suhailah.devdojo.maratonajava.introducao;

import javax.print.attribute.SetOfIntegerSyntax;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num01 = 10;
        int num02 = 40;
        int resultado = num01 + num02;
        System.out.println(resultado);

        int num03 = 10;
        int num04 = 40;
        int resultado1 = num04 - num03;
        System.out.println(resultado1);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= !=  ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 == 20;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println( "isDezIgualAVinte " +isDezIgualAVinte);
        System.out.println( "isDezDiferenteQueVinte " +isDezDiferenteQueVinte);

        // && (AND) ||(or)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 29 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaConcorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystation5Compravel = valorTotalContaConcorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println(isPlaystation5Compravel);

        // = += -= /= %=
        double bonus = 1800;
        // double bonus = bonus + 1000;
        bonus+=100;
        System.out.println("Bonus:" + bonus);
        bonus-=200;
        System.out.println("Bonus:" + bonus);
        bonus/=4;
        System.out.println("Bonus:" + bonus);
        bonus%=200;
        System.out.println("Bonus:" + bonus);

        // Operadores Aritméticos Unários
        int contador = 0;
        contador += 1; // contador = contador + 1;
        System.out.println(contador);
        contador++;
        contador--;
        System.out.println(contador);
        ++contador;
        --contador;
        System.out.println(contador);


    }
}
