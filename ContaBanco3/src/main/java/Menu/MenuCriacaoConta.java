package Menu;

import Conta.ContaCorrente;
import Conta.ContaInvestimento;
import Conta.ContaPoupanca;

import java.util.Scanner;

public class MenuCriacaoConta{

    ContaCorrente[] Pj_CC;
    ContaInvestimento[] Pj_CI;
    ContaCorrente[] Pf_CC;
    ContaInvestimento[] Pf_CI;
    ContaPoupanca[] Pf_CP;

    private int maxTamVetor = 3;

    public int getMaxTamVetor() {
        return maxTamVetor;
    }

    public void setMaxTamVetor(int maxTamVetor) {
        this.maxTamVetor = maxTamVetor;
    }

    public void menuCriacao(){


        int MAX_TAM_VETOR = 5;

        Scanner entrada = new Scanner (System.in);

        Pj_CC = new ContaCorrente[MAX_TAM_VETOR];
        Pj_CI = new ContaInvestimento[MAX_TAM_VETOR];
        Pf_CC = new ContaCorrente[MAX_TAM_VETOR] ;
        Pf_CI = new ContaInvestimento[MAX_TAM_VETOR];
        Pf_CP = new ContaPoupanca[MAX_TAM_VETOR];



            System.out.println("********* TIPO DE CONTA *********");
            System.out.println();
            System.out.println("|------------ MENU ------------|");
            System.out.println("| 1- PESSOA FISICA             |");
            System.out.println("| 2- PESSOA JURIDICA           |");
            System.out.println("|------------------------------|");
            System.out.println();
            System.out.println("Selecione a operação desejada: ");
            int tipoOperaid = entrada.nextInt();


            switch (tipoOperaid) {
                case 1:
                    System.out.println("********* CRIAR CONTA *********");
                    System.out.println();
                    System.out.println("|------------ MENU ------------|");
                    System.out.println("| 1- CONTA CORRENTE            |");
                    System.out.println("| 2- CONTA INVESTIMENTO        |");
                    System.out.println("| 3- CONTA POUPANÇA            |");
                    System.out.println("|------------------------------|");
                    System.out.println();
                    System.out.println("Selecione a operação desejada: ");
                    int criaOperaidPf = entrada.nextInt();

                    switch (criaOperaidPf) {

                        case 1:
                            for (int cont = 0; cont < maxTamVetor ; cont++) {
                                if (Pf_CC[cont] == null) {
                                    Pf_CC[cont] = new ContaCorrente();
                                    break;
                                }
                            } break;

                        case 2:
                            for (int cont = 0; cont < maxTamVetor; cont++) {
                                if (Pf_CI[cont] == null) {
                                    Pf_CI[cont] = new ContaInvestimento();
                                    break;
                                }
                            } break;

                        case 3:
                            for (int cont = 0; cont < maxTamVetor; cont++) {
                                if (Pf_CP[cont] == null) {
                                    Pf_CP[cont] = new ContaPoupanca();
                                    break;
                                }
                            } break;

                        default:
                            System.out.println("Operação inválida");
                    }


                case 2:
                    if (tipoOperaid == 2) {
                        System.out.println("|------------ MENU ------------|");
                        System.out.println("| 1- CONTA CORRENTE            |");
                        System.out.println("| 2- CONTA INVESTIMENTO        |");
                        System.out.println("| 3- VOLTAR AO MENU INICIAL    |");
                        System.out.println("|------------------------------|");
                        System.out.println();
                        System.out.println("Selecione a operação desejada: ");
                        int criaOperaidPj = entrada.nextInt();

                        switch (criaOperaidPj) {
                            case 1:
                                for (int cont = 0; cont < maxTamVetor; cont++) {
                                    if (Pj_CC[cont] == null) {
                                        Pj_CC[cont] = new ContaCorrente();
                                        break;
                                    }
                                } break;

                            case 2:
                                for (int cont = 0; cont < maxTamVetor; cont++) {
                                    if (Pj_CI[cont] == null) {
                                        Pj_CI[cont] = new ContaInvestimento();
                                        break;
                                    }
                                } break;

                            default:
                                System.out.println("Operação inválida");
                        }
            } }
        }
    }
