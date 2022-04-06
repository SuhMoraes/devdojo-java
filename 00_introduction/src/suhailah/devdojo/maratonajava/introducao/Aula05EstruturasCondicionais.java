package suhailah.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoIrParaOBailao = idade > 18;

        if(isAutorizadoIrParaOBailao){
            System.out.println("Pode ir para o bailão");
        }

        if(!isAutorizadoIrParaOBailao){
            System.out.println("Espere o tempo certo de ir para o bailão");
        }

        // Else - IF
        boolean isEstouMilhonario = true;

        if(isEstouMilhonario != false){
            System.out.println("Está milhonario");
        } else {
            System.out.println("Ainda não estou milhonário");
        }
    }
}
