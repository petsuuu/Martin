package br.com.peterson.martin.herancaeinterface.bytebankherdado.main;

import br.com.peterson.martin.herancaeinterface.bytebankherdado.Cliente;
import br.com.peterson.martin.herancaeinterface.bytebankherdado.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();


		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2590.80);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}