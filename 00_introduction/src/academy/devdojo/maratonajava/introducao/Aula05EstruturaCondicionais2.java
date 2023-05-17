package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais2 {

    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

     /*    int idade = 15;

       if(idade < 15 ) {
            System.out.println("Categoria Infantil");
        } else if( idade >=15) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
        */

        // Refatorando o código
        int idade = 13;
        String categoria;

        if(idade < 15 ) {
            categoria ="Categoria Infantil";
        } else if( idade >=15) {
           categoria ="Categoria Juvenil";
        } else {
            categoria ="Categoria Adulto";
        }

        System.out.println(categoria);

    }
}
