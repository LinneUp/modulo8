package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Banco banco = new Banco();
    Conta contas = new Conta();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Banco");
        int option;
        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println(" 1 - Criar Conta ");
            System.out.println(" 2 - Depositar Valor ");
            System.out.println(" 3 - Sacar Valor ");
            System.out.println(" 4 - Transferir Valor ");
            System.out.println(" 5 - Verificar Valores ");
            System.out.println(" 0 - Sair ");

            System.out.println(" Selecione a opção desejada: ");
            option = scanner.nextInt();

            process(option);
        } while (option != 0);
    }

    public static void process(int option) {


        switch (option) {
            case 1: {
                Conta contas = new Conta();
                Banco banco = new Banco();
                ContaPoupanca contaPoupanca = new ContaPoupanca();

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu Nome");
                String nome = scanner.next();
                contas.setNome(nome);
                banco.addNovaConta(contas);


                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();
                contas.setNumero(numero);

                break;
            }
            case 2: {
                Conta contas = new Conta();
                Banco banco = new Banco();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu Nome");
                String nome = scanner.next();
                banco.addNovaConta(contas);
                contas.setNome(nome);




                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();
                contas.setNumero(numero);

                System.out.println("Digite o valor para Depositar : ");
                int depositar = scanner.nextInt();
                contas.setDepositar(depositar);

                break;
            }
            case 3: {
                Conta contas = new Conta();
                Banco banco = new Banco();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu Nome");
                String nome = scanner.next();
                contas.setNome(nome);


                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();
                contas.setNumero(numero);

                System.out.println("Digite o valor para Sacar : ");
                int sacar = scanner.nextInt();
                contas.setSacar(sacar);


                break;

            }

            case 4: {
                Conta conta = new Conta();
                Banco banco = new Banco();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o numero da Conta que o dinheiro irá sair ");
                int numero = scanner.nextInt();
                conta.setSacar(numero);
                banco.addNovaConta(conta);

                System.out.println("Digite o numero da Conta que o dinheiro irá Entrar ");
                int numero2 = scanner.nextInt();
                conta.setDepositar(numero2);

                System.out.println("Digite o Valor a ser transferido: ");
                double depositar = scanner.nextDouble();
                conta.setDepositar(depositar);


                break;
            }

            case 5: {
                Conta contas = new Conta();
                Banco banco = new Banco();
                System.out.println("O Valor de todas as Contas é: " + banco.getSaldoTotal() + contas.getSaldo());

                break;
            }

        }
    }
}