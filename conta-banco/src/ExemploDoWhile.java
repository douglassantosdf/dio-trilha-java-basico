import java.util.Random;
//bibliotecaa para gerrar valor randomico

// ele executa ao menos uma vez, e continua enquanto seja TRUE

public class ExemploDoWhile {
    public static void main(String [] args){
        System.out.println("Discando...");
        do {
            //executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando");

        }while (tocando());

        System.out.println("Alô!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("atendeu? "+ atendeu);

        return ! atendeu;
    }
}
