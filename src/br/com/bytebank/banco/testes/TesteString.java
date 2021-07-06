package br.com.bytebank.banco.testes;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";

        //teste metodos:

        String vazio = " a   ";
        String outroVazio = vazio.trim(); //exclui espaços
        System.out.println(vazio.contains("a")); // retorna true/false se possuir.
        System.out.println(outroVazio.isEmpty()); // retorna true/false sobre estar vazio.

        char c = nome.charAt(2); // mostra o caracter na posição 2.
        System.out.println(c);

        String outra = nome.toUpperCase(); //deixa as letras maiusculas, tem o toLowerCase que faz o contrario
        System.out.println(outra);

        int posicao = nome.indexOf("ra"); // mostra a posicao dessa string.
        System.out.println(posicao);

        for(int i = 0; i < nome.length(); i++){ //length = tamanho string, numero caracteres.
            System.out.println(nome.charAt(i));
        }
    }
}
