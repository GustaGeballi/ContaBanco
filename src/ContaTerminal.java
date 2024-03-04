import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        float saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Por favor, digite sua Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque");

    }
}
