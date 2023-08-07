package academy.devdojo.maratonajava.javacore.Npolimorfismo.repository;

public class RepositoryMemoria implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando dados em memoria");
    }
}
