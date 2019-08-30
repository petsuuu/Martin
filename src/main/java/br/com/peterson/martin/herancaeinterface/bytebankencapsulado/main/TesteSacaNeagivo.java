package br.com.peterson.martin.herancaeinterface.bytebankencapsulado.main;

import br.com.peterson.martin.herancaeinterface.bytebankencapsulado.Conta;

public class TesteSacaNeagivo {
	public static void main(String[] args) {
		Conta conta = new Conta(6646,969060);
		conta.deposita(100);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.getSaldo());

	}
}