package br.com.peterson.martin.herancaeinterface.bytebankherdadoconta;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
