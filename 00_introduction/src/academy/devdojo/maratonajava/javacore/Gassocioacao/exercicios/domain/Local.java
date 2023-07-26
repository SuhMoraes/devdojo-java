package academy.devdojo.maratonajava.javacore.Gassocioacao.exercicios.domain;

public class Local {

    private String endereco;

    private Seminario seminario;

    public Local() {
    }

    public Local(String endereco, Seminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
