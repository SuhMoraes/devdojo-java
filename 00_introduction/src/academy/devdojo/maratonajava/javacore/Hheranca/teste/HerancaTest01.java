package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria Fernanda");
        Endereco endereco = new Endereco();
        endereco.setCep("012345-209");
        endereco.setRua("Rua Maravilha");

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Maria Fernanda");
        funcionario.setSalario(6900.00);
        funcionario.setNome("Sabrina Moraes");
        funcionario.setCpf("789.456.123-89");
        funcionario.setEndereco(endereco);

        funcionario.imprime();

        funcionario.relatorioPagamento();

    }
}
