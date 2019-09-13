package br.com.peterson.martin.excecoes.javaPilha.main;

import br.com.peterson.martin.excecoes.javaPilha.Conexao;

public class TesteConexao {

    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }


     /*   //------------------------------------------
        Conexao con = null;
        try {
            con = new C
            onexao();
            con.leDados();
            con.fecha();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            System.out.println("finally");
            if (con != null) {
                con.fecha();

            }
        }
    }*/
    }
}
