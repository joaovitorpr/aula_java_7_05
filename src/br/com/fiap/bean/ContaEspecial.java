package br.com.fiap.bean;

public class ContaEspecial extends ContaBancaria{
    //Criando atributos
    private float limite;

    //construtores
    public ContaEspecial() {}

    //metodos getters and setters
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    //metodo
    public float sacar(float valor) {
        if (valor <= (getSaldo() + this.limite)) {
            float novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            return getSaldo();
        } else {
            System.out.println("Valor acima do limite padrão");
            return getSaldo();
        }
    }
}
