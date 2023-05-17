package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 15;
        int resultado = numero1 + numero2;

        System.out.println( "Valor " + resultado);


        // %

        int resto = 10 % 1;
        System.out.println(resto);


        // < > <= >=  == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezDiferenteVinte" + isDezDiferenteVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);


        // Operadores Lógicos && (AND) || (OR) !

        int idade  = 29;
        double salario = 3500.0;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaConrrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaConrrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel: " + isPlaystationCincoCompravel);



        //  = += -= *= /= %=
        double bonus = 1000;
        bonus = bonus + 1000;
        bonus += 1000;
        bonus -=  1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        System.out.println("Contardor 1: "+ contador);
        int contadorDois = 0;
        contadorDois++;
        System.out.println("Contardor 2: "+ contadorDois);

    }
}


