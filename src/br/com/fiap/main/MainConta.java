package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {
        String aux, nomecliente, escolha = "sim";
        int opcao, numConta, diaDeRendimento, acao;
        float saldocliente, limite, valor, rendimento;
        LocalDate dataAtual = LocalDate.now();
        while (escolha.equalsIgnoreCase("sim")){
            try {
                aux = JOptionPane.showInputDialog("Informe qual conta bancaria o senhor possui?\n1-Conta Bancaria.\n2-Conta Poupança.\n3-Conta Especial.\nInsirá:");
                opcao = Integer.parseInt(aux);
                switch (opcao){
                    case 1:
                        ContaBancaria cb = new ContaBancaria();
                        nomecliente = JOptionPane.showInputDialog("Digite seu nome: ");
                        aux = JOptionPane.showInputDialog("Insira o número da sua conta:");
                        numConta = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Informe seu saldo atual:");
                        saldocliente = Float.parseFloat(aux);
                        cb.setCliente(nomecliente);
                        cb.setNumConta(numConta);
                        cb.setSaldo(saldocliente);
                        aux = JOptionPane.showInputDialog("O que deseja fazer?\n1-Depositar.\n2-Sacar.\nInforme:");
                        acao = Integer.parseInt(aux);
                        if (acao == 1) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja depositar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Deposito realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", cb.getCliente(), cb.getNumConta(), cb.depositar(valor)));
                            break;
                        } else if (acao == 2) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja sacar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Saque realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", cb.getCliente(), cb.getNumConta(), cb.sacar(valor)));
                            break;
                        } else {
                        JOptionPane.showMessageDialog(null, "ERRO: Opção escolhida inválida!");
                        break;
                        }
                    case 2:
                        ContaPoupanca cp = new ContaPoupanca();
                        nomecliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
                        aux = JOptionPane.showInputDialog("Digite o n° da conta: ");
                        numConta = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Informe o seu saldo atual: ");
                        saldocliente = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite o dia de rendimento: ");
                        diaDeRendimento = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Informe rendimento: ");
                        rendimento = Float.parseFloat(aux);
                        cp.setCliente(nomecliente);
                        cp.setNumConta(numConta);
                        cp.setSaldo(saldocliente);
                        cp.setDiaDeRendimento(diaDeRendimento);
                        if (dataAtual.getDayOfMonth() >= diaDeRendimento ) {
                            cp.novoSaldo(rendimento);
                        }
                        aux = JOptionPane.showInputDialog("O que deseja fazer?\n1-Depositar.\n2-Sacar.\nInforme:");
                        acao = Integer.parseInt(aux);
                        if (acao == 1) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja depositar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Deposito realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", cp.getCliente(), cp.getNumConta(), cp.depositar(valor)));
                            break;
                        } else if (acao == 2) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja sacar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Saque realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", cp.getCliente(), cp.getNumConta(), cp.sacar(valor)));
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "ERRO: Opção escolhida inválida!");
                            break;
                        }
                    case 3:
                        ContaEspecial ce = new ContaEspecial();
                        nomecliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
                        aux = JOptionPane.showInputDialog("Digite o n° da conta: ");
                        numConta = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Informe o seu saldo atual: ");
                        saldocliente = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("insira o limite da sua conta: ");
                        limite = Float.parseFloat(aux);
                        ce.setCliente(nomecliente);
                        ce.setNumConta(numConta);
                        ce.setSaldo(saldocliente);
                        ce.setLimite(limite);
                        aux = JOptionPane.showInputDialog("O que deseja fazer?\n1-Depositar.\n2-Sacar.\nInforme:");
                        acao = Integer.parseInt(aux);
                        if (acao == 1) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja depositar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Deposito realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", ce.getCliente(), ce.getNumConta(), ce.depositar(valor)));
                            break;
                        } else if (acao == 2) {
                            aux = JOptionPane.showInputDialog("Digite o valor que deseja sacar: ");
                            valor = Float.parseFloat(aux);
                            JOptionPane.showMessageDialog(null, String.format("Saque realizado com sucesso!\nCliente: %s\nNúmero da conta: %d\nSaldo Atual: %.2f", ce.getCliente(), ce.getNumConta(), ce.sacar(valor)));
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "ERRO: Opção escolhida inválida!");
                            break;
                        }
                    default:
                        throw new Exception("ERRO: Opção escolhida, inválida.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar (sim|não)?");
        }
        JOptionPane.showMessageDialog(null, "Até logo, volte sempre!");
    }
}
