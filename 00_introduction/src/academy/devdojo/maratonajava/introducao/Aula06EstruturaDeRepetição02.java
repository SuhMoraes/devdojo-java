package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição02 {
    public static void main(String[] args) {

        // Imprima todos os numeros pares de 0 até 1000000
        int numero = 1000000;

        for(int i= 0; i <= numero; i++){
            if(i % 2 == 0) {
                System.out.println("Número pares: " + i);
            }
        }
    }
}
