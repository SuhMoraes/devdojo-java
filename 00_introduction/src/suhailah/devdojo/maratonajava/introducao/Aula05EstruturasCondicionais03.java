package suhailah.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 2000.00;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não ganho 6k para doar, mas vou ";
        String resultado = salario > 3000 ? mensagemDoar : mensagemNaoDoar;

        // Clean Code
        String resultado1 = salario > 1500 ? "Eu vou doar 500 pro DevDojo" : "Ainda não ganho 6k para doar, mas vou ";




        System.out.println(resultado);


    }
}
