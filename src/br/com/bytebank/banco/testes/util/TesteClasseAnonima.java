package br.com.bytebank.banco.testes.util;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.GuardadorDeContas;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}