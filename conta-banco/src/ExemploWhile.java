import java.util.concurrent.ThreadLocalRandom;
// biblioteca para trazer metedo de aleatoriedade

// WHILE enquanto o codigo cumpre a condição ele executa, caso não cumpra de inciio ele nao executa
// entao executa enquanto a empresa seja TRUE - verdadeira
public class ExemploWhile {
    
    public static void main (String[] args){
        //valor incial mesada
        double mesada = 50.0;

        // laco para que enquanto tiver mesada continua executando
        while (mesada>0) {
            Double valorDoce = valorAleatorio(); //aqui tem o valor aleatório que colocamos la
                                                // no fim para gerar entra 6  e 17.

            //faz com que o ultimo doce fique automaticante vire o 
            //valor do restante da mesada caso o valor do doce seja maior, 
            //se eleminar esse bloco vem valor negativo.
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }


            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou tudo em doces");
    }

    //aqui criamos o fatos de aleatoriedade, onde gera entre 6 e 17 um valor aleatório e 
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(6, 17);
    }


}
