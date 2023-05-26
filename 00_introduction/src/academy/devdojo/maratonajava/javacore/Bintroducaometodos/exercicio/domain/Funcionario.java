package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio.domain;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


    public void imprimirDados() {
        //System.out.println(nome + '\n' + idade + '\n' + salario);
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.println("'\nMédia salarial " + media);
    }

}
