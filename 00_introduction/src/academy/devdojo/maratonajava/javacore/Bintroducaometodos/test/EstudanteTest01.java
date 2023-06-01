package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Fabian";
        estudante01.idade = 32;
        estudante01.sexo = 'F';

        estudante02.nome = "Julia";
        estudante02.idade = 24;
        estudante02.sexo = 'M';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);
        System.out.println("=======================");
        estudante01.imprime();


    }
}
