package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends Conta {
    public Menu(String nome, int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        super(nome, numero, agencia, banco, saldo, sacar, depositar);
    }
    List<Conta> contas = new ArrayList<>();

    class Banco {
        List<Conta> contas = new ArrayList<>();

        public List<Conta> getContas() {
            return contas;
        }

        public void setContas(List<Conta> contas) {
            this.contas = contas;
        }



    }



    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Banco");
        int option;
        do {
            System.out.println("Digite qual Conta quer Criar: ");
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
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu Nome");
                String nome = scanner.next();
                contas.setNome(nome);

                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();
                contas.setNumero(numero);

                break;
            }
            case 2: {
                Conta contas = new Conta();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu Nome");
                String nome = scanner.next();
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
                Conta contas = new Conta();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o numero da Conta que o dinheiro irá sair ");
                int numero = scanner.nextInt();
                contas.setSacar(numero);

                System.out.println("Digite o numero da Conta que o dinheiro irá Entrar ");
                int numero2 = scanner.nextInt();
                contas.setDepositar(numero2);

                System.out.println("Digite o Valor a ser transferido: ");
                double depositar = scanner.nextDouble();
                contas.setDepositar(depositar);


                break;
            }

            case 5: {
               Conta contas = new Conta();

                System.out.println("O Valor de todas as Contas é: " + contas.getSaldo()+contas.getDepositar() );

                break;
            }

        }
    }
}