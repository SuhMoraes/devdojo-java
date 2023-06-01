package academy.devdojo.maratonajava.javacore.Gassocioacao.test;

import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassocioacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Marciano");
        Professor professor2 = new Professor("Antonieta");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("E.E. Manuela Lacerda", professores);

        escola.imprime();

    }
}
