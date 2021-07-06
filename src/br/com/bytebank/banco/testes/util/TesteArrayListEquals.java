package br.com.bytebank.banco.testes.util;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc2);

        System.out.println("Já existe? " + existe);

        for(Object oRef : lista) {
            System.out.println(oRef);
        }
    }
}
