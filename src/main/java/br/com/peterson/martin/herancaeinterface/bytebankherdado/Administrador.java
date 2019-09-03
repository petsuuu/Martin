package br.com.peterson.martin.herancaeinterface.bytebankherdado;

public class Administrador extends Funcionario implements Autenticavel{

      @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
