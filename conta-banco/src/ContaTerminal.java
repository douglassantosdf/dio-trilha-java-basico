import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner contaPrincipal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta:");
        int numeroConta = contaPrincipal.nextInt();


        System.out.println("Digite o número da agência:");
        String numeroAgencia = contaPrincipal.next();

        System.out.println("Digite o nome de Usuário:");
        String nomeConta = contaPrincipal.next();

        System.out.println("Digita o seu Saldo:");
        double saldoAtual = contaPrincipal.nextDouble();

        System.out.println("Olá " + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + "e seu saldo " + saldoAtual + " já está disponível para saque.");

        contaPrincipal.close();

    }



}
