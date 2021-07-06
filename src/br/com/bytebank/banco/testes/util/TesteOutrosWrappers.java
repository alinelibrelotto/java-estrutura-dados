package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue()); //unboxing

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.intValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f); //polimorfismo

        List<Number> lista = new ArrayList<>();
        lista.add(26);
        lista.add(26.5);
        lista.add(26.4f);
    }
}
