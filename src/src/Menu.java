package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    static ArrayList<Conta> contasBancarias;



    public static void main(String[] args){
        contasBancarias = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Banco");
        int option;
        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println(" 1 - Criar Conta ");
            System.out.println(" 2 - Depositar Valor ");
            System.out.println(" 3 - Sacar Valor ");
            System.out.println(" 4 - Transferir Valor ");
            System.out.println(" 5 - Listar ");
            System.out.println(" 0 - Sair ");

            System.out.println(" Selecione a opção desejada: ");
            option = scanner.nextInt();

            process(option);
        } while (option != 0);
    }

    public static void process(int option) {


        switch (option) {
            case 1: {
                criarConta();
                break;
            }
            case 2: {
                depositar();
                break;
            }
            case 3: {
                sacar();
                break;
            }

            case 4: {
                transferir();
                break;
            }

            case 5: {
                listarContas();
                break;
            }
            case 6:{
                System.exit(0);
            }

        }
    }
    public static void criarConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNome");
        String nome = scanner.next();

        System.out.println("\nCpf");
        String cpf = scanner.next();

        System.out.println("\nEmail");
        String email = scanner.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        Conta conta = new Conta(nome);

        contasBancarias.add(conta);
        System.out.println("--- Sua conta foi criada com sucesso! ---");
    }
    private static Conta encontrarConta(int numeroConta){
      Conta conta =null;
      if (contasBancarias.size() > 0){
          for(Conta c: contasBancarias){
              if (c.getNumeroConta() == numeroConta);
              conta = c;
          }
      }
      return conta;
    }
    public  static  void  depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero da Conta para Deposito");
        int numeroConta = scanner.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null){
            System.out.println("Digite o Valor desejado para deposito ");
            double valorDeposito= scanner.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor Depositado com Sucesso");

        }else{
            System.out.println("Conta não foi Encontrada");
        }
    }
    public  static  void  sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero da Conta para Deposito");
        int numeroConta = scanner.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null){
            System.out.println("Digite o Valor desejado para saque ");
            double valorSaque= scanner.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Valor sacado com Sucesso");
        }else{
            System.out.println("Conta não foi Encontrada");
        }

    }
    public static  void  transferir(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero da Conta Remetente: ");
        int numeroContaRemetente = scanner.nextInt();
        Conta contaRemetente = encontrarConta(numeroContaRemetente);
        if (contaRemetente != null){
            System.out.println("Digite o Numero do Destinatário: ");
            int numeroContaDestinatario = scanner.nextInt();
            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
            if (contaDestinatario != null){
                System.out.println("Digite o valor da Transferencia: ");
                double transferencia = scanner.nextDouble();
                contaRemetente.transferir(contaDestinatario,transferencia);
            }
        }

    }
    public  static  void listarContas(){
        if (contasBancarias.size() >0){
            for (Conta conta: contasBancarias){
                System.out.println(conta);
            }

        }else{
            System.out.println("não há contas cadastradas");
        }
    }
}
