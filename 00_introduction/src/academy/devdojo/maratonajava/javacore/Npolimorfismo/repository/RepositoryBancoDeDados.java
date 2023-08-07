package academy.devdojo.maratonajava.javacore.Npolimorfismo.repository;

public class RepositoryBancoDeDados implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando dados em um Banco de dados");
    }
}
