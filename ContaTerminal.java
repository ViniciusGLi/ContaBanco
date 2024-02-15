import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite numero da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Digite o numero da sua agencia com o digito: (nesse modelo XXX-x) ");
        agencia = sc.nextLine();

        System.out.print("Digite o seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.print("Digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Sua vonta foi criada com Sucesso! Numero da conta %d, agencia %s, nome %s, saldo: %.2f%n", numero, agencia, nomeCliente, saldo);

        sc.close();
    }

}
