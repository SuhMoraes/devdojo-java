package academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.test;

import academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.domain.Seminario;

import java.util.Arrays;

public class ExecTest {

    public static void main(String[] args) {
        Local local = new Local("Rua Maravilha");
        Aluno aluno1 = new Aluno("Flávia Martins", 32);
        Aluno aluno2 = new Aluno("Mariano", 24);
        Aluno aluno3 = new Aluno("Helena", 28);
        Professor professor = new Professor("Rui Barbosa", "Cineasta");
        Aluno[] alunosConfirmados = {};

        Seminario seminario = new Seminario("'Passando a emoção no teatro'", alunosConfirmados, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
