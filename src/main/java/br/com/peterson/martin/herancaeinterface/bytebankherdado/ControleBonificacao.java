package br.com.peterson.martin.herancaeinterface.bytebankherdado;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }

}