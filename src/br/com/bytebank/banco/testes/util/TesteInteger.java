package br.com.bytebank.banco.testes.util;

public class TesteInteger {

    public static void main(String[] args) {
        int[] idades = new int[5];
        String [] nomes = new String[5];

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); //autoboxing

        System.out.println(idadeRef.doubleValue()); //transforma int em double

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); //unboxing

        String s = args[0];

        int numero = Integer.parseInt(s);
        System.out.println(numero);
    }
}
