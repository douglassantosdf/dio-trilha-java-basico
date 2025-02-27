// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;


public class SaldoContaCliente {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: Solicita e lê o saldo do cliente
        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        // Saída: Classificação do cliente baseada no saldo
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else {
            System.out.println("Confortável");
        }

        // Fecha o scanner
        scanner.close();
    }
}