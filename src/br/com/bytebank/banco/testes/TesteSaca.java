package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
