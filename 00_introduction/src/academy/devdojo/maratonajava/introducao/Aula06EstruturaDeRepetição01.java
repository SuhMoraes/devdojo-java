package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição01 {
    public static void main(String[] args) {

        // while, do while, for

        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count += 1;
        }

        do {
            System.out.println("dentro do do-while");
            count++;
        } while (count < 10);

        for (int i=0; i<10; i++) {
            System.out.println("Estrutura de Repetição For: " + i);

        }
    }
}
