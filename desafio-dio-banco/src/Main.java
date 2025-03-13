public class Main {

    public static void main (String [] args){
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.imprimirInfoComuns();
        poupanca.imprimirInfoComuns();

        cc.depositar(20000000.20);

        cc.transferir(75, poupanca);

        System.out.println("===Nova Operacao");

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.emprestimo();
    }

}
