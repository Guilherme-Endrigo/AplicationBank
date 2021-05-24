import Menu.InternetBankingPf;
import Menu.InternetBankingPj;
import Menu.MenuAcesso;
import Menu.MenuCriacaoConta;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        InternetBankingPj i = new InternetBankingPj();
        MenuCriacaoConta j = new MenuCriacaoConta();
        InternetBankingPf k = new InternetBankingPf();
        MenuAcesso l = new MenuAcesso ();


        boolean sair = true;
        do {
            System.out.println("=======================================================");
            System.out.println("            S I S T E M A   B A N C A R I O            ");
            System.out.println("=======================================================");
            System.out.println("[1] Internet Banking");
            System.out.println("[2] Abrir Conta");
            System.out.println("[0] Sair");
            System.out.println("=======================================================");
            System.out.print("Operação: ");
            int operacao;
            operacao = entrada.nextInt();

            switch (operacao) {
                case 1:
                    l.menuAcessar(i,j,k);



                case 2:

                    j.menuCriacao();
                    break;


                case 0:
                    sair = false;
                    break;

                default:
                    System.out.println("Operação inválida");
            }
        } while (sair);
        System.out.println("Saindo do sistema");

    }

}






