package br.com.peterson.martin.pacotesJavaLang.bytebank.banco.modelo;


/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Peterson Cardoso
 * @version 0.1
 */
public abstract class Conta extends Object {

    /**
     * The Saldo.
     */
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partie da agencia
     *
     * @param agencia the agencia
     * @param numero  the numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    /**
     * Deposita.
     *
     * @param valor the valor
     */
    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que saldo
     *
     * @param valor the valor
     * @throws SaldoInsuficienteException the saldo insuficiente exception
     */
    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }

    /**
     * Transfere.
     *
     * @param valor   the valor
     * @param destino the destino
     * @throws SaldoInsuficienteException the saldo insuficiente exception
     */
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    /**
     * Get saldo double.
     *
     * @return the double
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * Get numero int.
     *
     * @return the int
     */
    public int getNumero(){
        return this.numero;
    }

    /**
     * Set numero.
     *
     * @param numero the numero
     */
    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    /**
     * Get agencia int.
     *
     * @return the int
     */
    public int getAgencia(){
        return this.agencia;
    }

    /**
     * Set agencia.
     *
     * @param agencia the agencia
     */
    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    /**
     * Set titular.
     *
     * @param titular the titular
     */
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    /**
     * Get titular cliente.
     *
     * @return the cliente
     */
    public Cliente getTitular(){
        return this.titular;
    }

    /**
     * Get total int.
     *
     * @return the int
     */
    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Numero: " +this.numero+ ", Agencia: "+this.agencia;
    }

}