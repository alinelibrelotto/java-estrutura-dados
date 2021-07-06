package br.com.bytebank.banco.testes.util;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {

       List<Conta> lista = new ArrayList<Conta>(); // <> = generics

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc); //adicona o elemento na lista

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println("Numero conta: " + ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho da lista após remocao do campo 0: " + lista.size());

        Conta cc3 = new ContaCorrente(02,111);
        lista.add(cc3); //adicona o elemento na lista

        Conta cc4 = new ContaCorrente(12,222);
        lista.add(cc4);

      //  for(int i = 0; i < lista.size(); i++) {
      //      Object oRef = lista.get(i);
      //      System.out.println(oRef);
      //  }

        for(Object oRef : lista) {            //for faz o mesmo do acima, mas é mais limpo
            System.out.println(oRef);
        }
    }
}
