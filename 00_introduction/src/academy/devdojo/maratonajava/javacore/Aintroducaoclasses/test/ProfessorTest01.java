package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Estudante professor = new Estudante();

        professor.nome = "Araújo";
        professor.idade = 52;
        professor.sexo = 'm';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
