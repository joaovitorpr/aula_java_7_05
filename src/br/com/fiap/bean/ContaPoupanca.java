package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    //Criando atributos
    private int diaDeRendimento;

    //construtores
    public ContaPoupanca() {}

    //metodos getters and setters
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    //metodos
    public float novoSaldo(float rendimento) {
        float saldoAtual = getSaldo() + (getSaldo() * (rendimento / 100));
        setSaldo(saldoAtual);
        return getSaldo();
    }
}
