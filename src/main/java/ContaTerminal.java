import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Digite o nome :");
            String nomeCliente = scan.nextLine();

            System.out.println("Por favor, digite o número da Agência :");
            String agencia = scan.nextLine();

            System.out.println("Digite o numero da conta:");
            int numero = scan.nextInt();

            System.out.println("Digite o saldo:");
            double saldo = scan.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.%n",
                    nomeCliente, agencia, numero, saldo);
        } catch (InputMismatchException e) {
            System.out.println("Error saldo só aceita com ponto exemplo 10.00 ");
        }


        scan.close();
    }


}
