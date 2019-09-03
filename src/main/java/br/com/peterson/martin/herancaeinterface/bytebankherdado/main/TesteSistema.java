package br.com.peterson.martin.herancaeinterface.bytebankherdado.main;

import br.com.peterson.martin.herancaeinterface.bytebankherdado.Administrador;
import br.com.peterson.martin.herancaeinterface.bytebankherdado.Cliente;
import br.com.peterson.martin.herancaeinterface.bytebankherdado.Gerente;
import br.com.peterson.martin.herancaeinterface.bytebankherdado.SistemaInterno;

public class TesteSistema {


    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        g.setSenha(3333);

        Cliente cliente = new Cliente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);



    }
}
