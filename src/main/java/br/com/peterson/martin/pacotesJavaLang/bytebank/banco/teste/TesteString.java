package br.com.peterson.martin.pacotesJavaLang.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {


        String nome = "TesteObject";//object literal
        // String outro = new String("Teste2");

        //Verifica se a String está vazia com boolean
        String vazio = "        TESTE       ";


        //Tira todo campo vazio da String
        String outroVazio = vazio.trim();
        //usa o contains verifica se existe o elemento dentro da String
        System.out.println(vazio.contains("TES"));
        System.out.println(outroVazio);

        //Verifica se a String está vazia com boolean
        //System.out.println(vazio.isEmpty());


        //Quantos caracteres tem na String
      //  System.out.println(nome.length());
        //Imprime um caracter por linha
     //   for (int i = 0; i < nome.length(); i++) {
     //       System.out.println(nome.charAt(i));
      //  }


        //Verificar a partir da primeira posição
        //String sub = nome.substring(1);
        //System.out.println(sub);

        //Verificar em qual posição esta a string
        // int pos = nome.indexOf("st");
        // System.out.println(pos);

        //Que ele mento esta na posição
        //char c = nome.charAt(2);
        // System.out.println(c);

//char c = 'T';
//char d = 't';

        //Alterar maiusculo por minusculo
        //String outra = nome.replace("T", "t");
        //System.out.println(outra);

        //Colocar maiusculo
        //String outra2 = nome.toUpperCase();
        // System.out.println(outra2);
    }
}
