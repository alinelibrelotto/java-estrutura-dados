package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5]; // cria uma array do tipo ContaCorrente com 5 espaços
        ContaCorrente cc1 = new ContaCorrente(22, 11); //cria um objeto
        contas[0] = cc1; // coloca o objeto criado dentro do campo 0

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        ContaCorrente xx = (ContaCorrente) contas[1];// type cast

        System.out.println(contas[1].getNumero());
        System.out.println(xx.getNumero());
    }

}
