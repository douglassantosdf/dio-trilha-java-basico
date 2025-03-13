public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double valorEmprestimo;

    


    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    // adiciona uma opção de emprestimo para caso o valor em conta seja superior a 100000.0
    public void emprestimo(){
        if (saldo > 100000.00) {
            System.out.println("você tem emprestimo liberado para sua conta");
        }
        else{
            System.out.println("emprestimo não esta disponivel para sua conta");
    
        }
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }


}
