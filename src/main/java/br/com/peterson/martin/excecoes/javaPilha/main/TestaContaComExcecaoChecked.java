package br.com.peterson.martin.excecoes.javaPilha.main;

import br.com.peterson.martin.excecoes.javaPilha.Conta;
import br.com.peterson.martin.excecoes.javaPilha.MinhaExcecao;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        } catch (MinhaExcecao ex) {
            System.out.println("tratamento...");
        }
    }
}
