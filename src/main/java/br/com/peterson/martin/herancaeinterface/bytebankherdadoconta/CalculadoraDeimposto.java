package br.com.peterson.martin.herancaeinterface.bytebankherdadoconta;

public class CalculadoraDeimposto {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
