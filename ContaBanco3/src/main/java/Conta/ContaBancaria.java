package Conta;

import java.util.Scanner;

public class ContaBancaria {
    Scanner entrada = new Scanner (System.in);


    private String numConta;
    public String nome;
    private String documento;
    private double saldo;


        public ContaBancaria() {
                System.out.print("Número da conta: ");
                this.numConta = entrada.next();
                System.out.print("Titular: ");
                this.nome = entrada.next();
                System.out.print("Digite o documento Titular: ");
                this.documento = entrada.next();
                this.setSaldo(0);
            }


        public String getNumConta() {
            return numConta;
        }

        public void setNumConta(String numConta) {
            this.numConta = numConta;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getDocumento() {
        return documento;
    }

        public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Conta: \n" + nome +
                "\nnumero da Conta = '" + numConta + '\'' +
                "\nsaldo = " + saldo;
    }
}


