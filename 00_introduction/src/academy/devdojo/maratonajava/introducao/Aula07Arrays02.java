package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
         String[] nomes = new String[4];

         nomes[0] = "Mario";
         nomes[1] = "Luigi";
         nomes[2] = "Princesa";

         for(int i = 0; i < nomes.length; i++) {
             System.out.println("Nomes: " + nomes[i]);
         }



    }
}
