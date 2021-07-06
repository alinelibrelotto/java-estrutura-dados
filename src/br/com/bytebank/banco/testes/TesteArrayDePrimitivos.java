package br.com.bytebank.banco.testes;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa array

      //  idades[0] = 29; - define o valor 29 p/ posicao 0.

      //  System.out.println(idades[0]);

        for(int i = 0; i< idades.length; i++){
            idades[i] = i * i;
        }

        for(int i = 0; i< idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
