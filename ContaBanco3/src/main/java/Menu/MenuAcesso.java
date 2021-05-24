package Menu;

import java.util.Scanner;

public class MenuAcesso {

    Scanner entrada = new Scanner (System.in);

    public void menuAcessar(InternetBankingPj i, MenuCriacaoConta j, InternetBankingPf k){


    System.out.println("********* TIPO DE CONTA *********");
    System.out.println();
    System.out.println("|------------ MENU ------------|");
    System.out.println("| 1- PESSOA FISICA             |");
    System.out.println("| 2- PESSOA JURIDICA           |");
    System.out.println("|------------------------------|");
    System.out.println();
    System.out.println("Selecione a operação desejada: ");
    int operaid = entrada.nextInt();


    switch (operaid){

        case 1:
            System.out.println("********* ACESSO A CONTA PESSOA FISICA *********");
            System.out.println();
            System.out.println("|--------------- MENU ----------------------------|");
            System.out.println("|    1- ACESSO A CONTA CORRENTE                   |");
            System.out.println("|    2- ACESSO A CONTA INVESTIMENTO               |");
            System.out.println("|    3- ACESSO A CONTA POUPANÇA                   |");
            System.out.println("|-------------------------------------------------|");
            System.out.println();
            System.out.println("Selecione a operação desejada: ");
            int OperaidPf = entrada.nextInt();

            switch (OperaidPf) {

                case 1:
                    System.out.print("Numero da Conta: ");
                    String numConta = entrada.next();
                    for (int cont = 0; cont < j.getMaxTamVetor (); cont++) {
                        if (j.Pf_CC[cont].getNumConta().equals(numConta)) {
                            k.menuPF_CC(j.Pf_CC[cont], j.Pf_CC);
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Numero da Conta: ");
                    numConta = entrada.next();
                    for (int cont = 0; cont < j.getMaxTamVetor (); cont++) {
                        if (j.Pf_CI[cont].getNumConta().equals(numConta)) {
                            k.menuPf_CI(j.Pf_CI[cont], j.Pf_CI);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Numero da Conta: ");
                    numConta = entrada.next();
                    for (int cont = 0; cont < j.getMaxTamVetor (); cont++) {
                        if (j.Pf_CP[cont].getNumConta().equals(numConta)) {
                            k.menuPF_CP(j.Pf_CP[cont], j.Pf_CP);
                        }
                    }
                    break;

                default:
                    System.out.println("Operação inválida");
            }

            break;


        case 2:
            System.out.println("********* ACESSO A CONTA JURIDICA *********");
            System.out.println();
            System.out.println("|--------------- MENU ---------------------|");
            System.out.println("|    1- ACESSO A CONTA CORRENTE            |");
            System.out.println("|    2- ACESSO A CONTA INVESTIMENTO        |");
            System.out.println("|------------------------------------------|");
            System.out.println();
            System.out.println("Selecione a operação desejada: ");
            int OperaidPj = entrada.nextInt();

            switch (OperaidPj) {

                case 1:
                    System.out.print("Numero da Conta: ");
                    String numConta = entrada.next();
                    for (int cont = 0; cont < j.getMaxTamVetor (); cont++) {
                        if (j.Pj_CC[cont].getNumConta().equals(numConta)) {
                            i.menuPj_CC(j.Pj_CC[cont], j.Pj_CC );
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Numero da Conta: ");
                    numConta = entrada.next();
                    for (int cont = 0; cont < j.getMaxTamVetor (); cont++) {
                        if (j.Pj_CI[cont].getNumConta().equals(numConta)) {
                            i.menuPj_CI(j.Pj_CI[cont], j.Pj_CI );
                            break;
                        }
                    }
                    break;


                default:
                    System.out.println("Operação inválida");
            }}
    }
}
