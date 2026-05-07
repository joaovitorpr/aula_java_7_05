package br.com.fiap.bean;

public class ContaBancaria {
    //Criando atributos da classe
    private String cliente;
    private int numConta;
    private float saldo;

    //Criando construtores
    public ContaBancaria() {}

    //Criando metodos getters e setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Criando metodos
    public float sacar(float valor){
        try {
            if (this.saldo - valor >= 0) {
                this.saldo = this.saldo - valor;
                return this.saldo;
            } else {
                throw new Exception("ERRO: Saldo insuficente para o saque");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return this.saldo;
        }
    }
    public float depositar(float valor){
        return this.saldo = this.saldo + valor;
    }
}
