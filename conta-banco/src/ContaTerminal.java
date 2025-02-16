import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner ContaPrincipal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta:");
        int numeroConta = ContaPrincipal.nextInt();


        System.out.println("Digite o número da agência:");
        String numeroAgencia = ContaPrincipal.next();

        System.out.println("Digite o nome de Usuário:");
        String nomeConta = ContaPrincipal.next();

        System.out.println("Digita o seu Saldo:");
        double saldoAtual = ContaPrincipal.nextDouble();

        System.out.println("Olá " + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + "e seu saldo " + saldoAtual + " já está disponível para saque.");

        ContaPrincipal.close();

    }



}
