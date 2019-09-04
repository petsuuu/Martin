package br.com.peterson.martin.herancaeinterface.bytebankherdado;


// Gerente eh um Funcionario,Gerente herda da class Funcionario,assina o contrato Autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();

	}
	@Override
	public double getBonificacao() {

		return super.getSalario() * 0.1;
	}


	@Override
	public void setSenha(int senha) {

	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}
}
