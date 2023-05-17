package academy.devdojo.maratonajava.introducao.DevDojoExec;

import java.util.Scanner;

public class CalculoImpostoSalario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Imposto Salarial");
        System.out.println("Digite o seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        double aliquotaPrimeiraFaixa = 7.5 / 100 ;
        double aliquotaSegundaFaixa = 15 / 100;
        double aliquotaTerceiraFaixa = 22.5 /100;
        double aliquotaQuartaFaixa = 27.5/100;
        double valorImpostoSalarial = 0;
       

        if(salarioMensal <= 1903.98) {
            System.out.println("Imposto isento");
        } else if( salarioMensal > 1903.99 && salarioMensal <= 2826.65) {
            valorImpostoSalarial = salarioMensal * aliquotaPrimeiraFaixa;
        } else if(salarioMensal >= 2826.66 && salarioMensal <= 3751.05) {
            valorImpostoSalarial = salarioMensal * aliquotaSegundaFaixa;
        } else if(salarioMensal >= 3751.06 && salarioMensal <= 4664.67) {
            valorImpostoSalarial = salarioMensal * aliquotaTerceiraFaixa;
        } else {
            valorImpostoSalarial = salarioMensal * aliquotaQuartaFaixa;
        }

        double salarioLiquido = salarioMensal - valorImpostoSalarial;

        System.out.println("Salário com desconto será: " + salarioLiquido );

    }
}
