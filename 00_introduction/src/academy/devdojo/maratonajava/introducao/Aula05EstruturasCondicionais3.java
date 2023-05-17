package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Eu não vou poder doar";
        String resultado;

        //Sem operador ternário

        if(salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado =  mensagemNaoDoar;
        }
            System.out.println(resultado);


        // Com operador ternário

       resultado = salario > 1500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println("Resultado com operador ternário: " +resultado);
    }
}
