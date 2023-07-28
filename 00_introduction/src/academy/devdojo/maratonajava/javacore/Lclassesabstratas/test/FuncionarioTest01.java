package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;
import jdk.swing.interop.DispatcherWrapper;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joana" ,5000);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("Suhailah", 7000);
        System.out.println(dev);
        dev.imprime();
        gerente.imprime();
    }
}
