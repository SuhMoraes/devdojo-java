package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.RepositoryBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.RepositoryMemoria;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryBancoDeDados();
        repository.salvar();

        Repository repository1 = new RepositoryMemoria();
        repository1.salvar();
    }
}
