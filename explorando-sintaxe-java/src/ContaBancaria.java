import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {


    public static void main (String[] args){
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu saldo:");
    //busca um valor para saldo inicial do tipo double
    double saldoInicial = scanner.nextDouble();
        //verificai o saldo no terminal
    System.out.println("seu saldo é "+ saldoInicial);

    System.out.println("Digita sua Transação n° 1");
    double transacaoUm = scanner.nextDouble();
    
    System.out.println("Digita sua Transação n° 2");
    double transacaoDois = scanner.nextDouble();
    
    System.out.println("Digita sua Transação n° 3");
    double transacaoTres = scanner.nextDouble();

    double saldoFinal = (saldoInicial + transacaoDois + transacaoTres + transacaoUm);
    
    System.out.println("Seu Saldo final é "+ saldoFinal + " .");
    scanner.close();

    }
}