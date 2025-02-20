public class ExemploBreakContinue {
    public static void main (String [] args){
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                //contiunue nao imprimi a condição e continua apartir dai, break para ocódigo e não imprime
                break;

                System.out.println(numero);
        }

    }
}
