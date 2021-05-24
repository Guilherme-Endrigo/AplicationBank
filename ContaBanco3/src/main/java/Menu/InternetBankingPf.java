package Menu;

import Conta.ContaBancaria;
import Conta.ContaCorrente;
import Conta.ContaInvestimento;
import Conta.ContaPoupanca;

import java.util.Scanner;

public class InternetBankingPf {

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



    public void menuPf_CI (ContaInvestimento conta, ContaInvestimento[] contas) {
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
                    sacar(conta);
                    break;
                case 3:
                    depositar(conta);
                    break;
                case 4:
                    transferir(conta, contas);
                    break;
                case 5:
                    investir(conta);
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

    public void menuPF_CC (ContaCorrente conta, ContaCorrente[] contas) {
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
                    sacar(conta);
                    break;
                case 3:
                    depositar(conta);
                    break;
                case 4:
                    transferir(conta, contas);
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

    public void menuPF_CP (ContaPoupanca conta, ContaPoupanca[] contas) {
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
            System.out.println("[5] Verificar rendimento da conta");
            System.out.println("[0] Sair");
            System.out.println("=======================================================");
            System.out.print("Operação: ");
            int operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    saldo(conta);
                    break;
                case 2:
                    sacar(conta);
                    break;
                case 3:
                    depositar(conta);
                    break;
                case 4:
                    transferir(conta, contas);
                    break;
                case 5:
                    calculaRendimento (conta);
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

    public void sacar(ContaBancaria conta) {
        System.out.print("Valor para o saque: R$ ");
        double valor = sc.nextDouble();
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositar(ContaBancaria conta) {
        System.out.print("Valor para depósito: R$ ");
        double valor = sc.nextDouble();
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depositado com sucesso");
    }

    public void transferir(ContaBancaria conta, ContaBancaria[] contas) {
        System.out.print("Conta para transferência: ");
        String numContaDestino = sc.next();
        for (int cont = 0 ; cont < 3 ; cont++) {
            if (contas[cont].getNumConta().equals(numContaDestino)) {
                contaDestino = contas[cont];
            }
        }
        System.out.print("Valor para transferência: ");
        double valor = sc.nextDouble();
        conta.setSaldo(conta.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }

   public void investir(ContaBancaria conta){
        final double TAXA = 1.03;

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
        }}

    public void calculaRendimento (ContaBancaria conta){
        final double TAXA_RENDIMENTO = 1.02;
        System.out.println ("Sua poupança esta rendendo 2% ao mês !");
        System.out.println ("Deseja ver seus rendimentos futuros? \n Caso sim digite SIM caso não digite NÃO ");
        String opcao = sc.nextLine();
        if (opcao.equalsIgnoreCase("Sim")) {
            System.out.println ("Informe quantos meses deseja saber o rendimento para o seu saldo atual:");
            int mesesRendimento = sc.nextInt ();
            double rendimento = conta.getSaldo () * Math.pow (TAXA_RENDIMENTO,mesesRendimento);
            System.out.println ("o novo valor da sua conta será: " + rendimento);
        }
        else if (opcao.equalsIgnoreCase("Não")){
            System.out.println ("Ok voltando ao Menu da sua conta");
        } else { System.out.println ("Opção invalida");
        }}
}
