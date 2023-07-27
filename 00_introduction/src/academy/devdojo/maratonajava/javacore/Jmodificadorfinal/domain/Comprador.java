package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Comprador {
    private String comprador;

    @Override
    public String toString() {
        return "Comprador{" +
                "comprador='" + comprador + '\'' +
                '}';
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

  }
