package Menu;

import Conta.ContaBancaria;
import Conta.ContaCorrente;
import Conta.ContaInvestimento;


import java.util.Scanner;

public class InternetBankingPj {

    private ContaBancaria conta;
    private ContaBancaria contaDestino;

    Scanner sc = new Scanner (System.in);

    public ContaBancaria getConta() {
        return conta;
    }

    public ContaBancaria getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaBancaria contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }


    public void menuPj_CC(ContaCorrente conta, ContaCorrente[] contas) {
        boolean sair = true;

        do {
            System.out.println("=======================================================");
            System.out.println("            I N T E R N E T   B A N K I N G            ");
            System.out.println("=======================================================");
            System.out.println("Bem vindo " + conta.getNome());
            System.out.println("=======================================================");
            System.out.println("[1] Saldo");
            System.out.println("[2] Sacar");
            System.out.println("[3] Depositar");
            System.out.println("[4] Transferir");
            System.out.println("[0] Sair");
            System.out.println("=======================================================");
            System.out.print("Operação: ");
            int operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    saldo(conta);
                    break;
                case 2:
                    sacarPj(conta);
                    break;
                case 3:
                    depositar(conta);
                    break;
                case 4:
                    transferirPj(conta, contas);
                    break;
                case 0:
                    sair = false;
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (sair);
        System.out.println("Até logo " + conta.getNome());
    }


    public void menuPj_CI (ContaInvestimento conta, ContaInvestimento[] contas) {
        boolean sair = true;

        do {
            System.out.println("=======================================================");
            System.out.println("            I N T E R N E T   B A N K I N G            ");
            System.out.println("=======================================================");
            System.out.println("Bem vindo " + conta.getNome());
            System.out.println("=======================================================");
            System.out.println("[1] Saldo");
            System.out.println("[2] Sacar");
            System.out.println("[3] Depositar");
            System.out.println("[4] Transferir");
            System.out.println("[5] Investir");
            System.out.println("[0] Sair");
            System.out.println("=======================================================");
            System.out.print("Operação: ");
            int operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    saldo(conta);
                    break;
                case 2:
                    sacarPj(conta);
                    break;
                case 3:
                    depositar(conta);
                    break;
                case 4:
                    transferirPj(conta, contas);
                    break;
                case 5:
                    investirPj(conta);
                    break;
                case 0:
                    sair = false;
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (sair);
        System.out.println("Até logo " + conta.getNome());
    }



    public void saldo(ContaBancaria conta) {
        System.out.println("Seu saldo é de R$ " + conta.getSaldo());
    }



    public void depositar(ContaBancaria conta) {
        System.out.print("Valor para depósito: R$ ");
        float valor = sc.nextFloat();
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depositado com sucesso");
    }

    public void transferirPj(ContaBancaria conta, ContaBancaria[] contas) {
        System.out.print("Conta para transferência: ");
        String numContaDestino = sc.next();
        for (int cont = 0 ; cont < 3 ; cont++) {
            if (contas[cont].getNumConta().equals(numContaDestino)) {
                contaDestino = contas[cont];
            } }
        System.out.print("Valor para transferência: ");
        float valor = sc.nextFloat();
        double total = valor - (valor * 0.05);
        conta.setSaldo(conta.getSaldo() - total);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }



    public void sacarPj(ContaBancaria conta) {
        System.out.print("Valor para o saque: R$ ");
        double valor = sc.nextDouble();
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            double total = valor - (valor * 0.05);
            conta.setSaldo(conta.getSaldo() - total);
            System.out.println("Saque realizado com sucesso");
        }
    }
    public void investirPj(ContaBancaria conta){
        final double TAXA = 1.05;

        System.out.print("Qual o valor que deseja investir: ");
        double valor = sc.nextDouble();
        System.out.println("por quanto tempo deseja deixar aplicado:");
        double tempo = sc.nextDouble();
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            double total = valor * Math.pow(TAXA,tempo);
            conta.setSaldo(conta.getSaldo() + total);
            System.out.println("Novo valor em conta pós investimento" +conta.getSaldo());
        }

    }
    }



