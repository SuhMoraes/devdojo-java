package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula06EstruturaDeRepetição04 {
    public static void main(String[] args) {

        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição é que o valorParcela >= 1000.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro a ser parcelado: ");
        double valorCarro = scanner.nextDouble();
        double valorParcela = 1000;
        double resultadoFinanciamento =  valorCarro / valorParcela;

        for(int parcela = 1; parcela <= valorCarro; parcela++) {
            if( parcela <= resultadoFinanciamento ){
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else  {
                break;
            }

        }

        System.out.println("Fora do If, mas dentro do for");


    }
}
