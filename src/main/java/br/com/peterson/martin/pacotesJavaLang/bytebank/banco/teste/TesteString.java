package br.com.peterson.martin.pacotesJavaLang.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {


        String nome = "Teste";//object literal
        // String outro = new String("Teste2");

        String outra = nome.replace("T", "t");
        String outra2 = nome.toUpperCase();

        System.out.println(nome);
        System.out.println(outra);
        System.out.println(outra2);
    }
}
