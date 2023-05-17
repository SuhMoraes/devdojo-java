package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        if(true) {
            System.out.println("O resultado é booleano!");
        }

        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;

        if(isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Liberado para comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado para comprar bebida alcoólica");
        }
    }
}
