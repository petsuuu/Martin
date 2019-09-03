package br.com.peterson.martin.herancaeinterface.bytebankherdado;

//contrato autenticavel
    //quem assina esse contrato,precisa implementar
        //metodo setSetnha
        //metodo autentica

public abstract interface Autenticavel {


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);


}
