package suhailah.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Jonas";
        String endereco = "Rua da Alegria";
        double salario = 5890.59;
        Date dataRecebimentoSalario = new Date();

        String relatorio = "Eu " + nome + ", morando no endereço "
                + endereco + " confirmo que recebi o salario de U$$" +
                salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }


}
