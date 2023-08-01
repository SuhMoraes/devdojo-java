package academy.devdojo.maratonajava.javacore.Minterfaces.domain;


public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Caregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo.");
    }
}
