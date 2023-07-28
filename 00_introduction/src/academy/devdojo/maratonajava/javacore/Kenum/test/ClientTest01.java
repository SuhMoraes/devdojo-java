package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClientTest01 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marvia", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Dayana", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Lucia", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente3);
        System.out.println(cliente);
        System.out.println(cliente2);
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);


    }
}
