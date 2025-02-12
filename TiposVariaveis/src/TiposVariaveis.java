public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // tipos primitivos
        // L e F depois de Long e depois de Float

        // operacao para deixar numero positvo
        //deve-se utilizar como no exemplo

        int numero = 5;
        
        numero = - numero;

        System.out.println(numero);

        // aqui a forma correta de transformar em positivo

        numero = numero * -1;

        System.out.println(numero);

        // fim~


        // x repeticao, para incremento

        int numeroCompleto = 5;

        // numero++;   tambem incrementa 1
        numeroCompleto = numeroCompleto + 1;


        System.out.println(numeroCompleto);

        //para usar na impressao se usar antes da variavel ele ja adiciona na impressao,e se depois depois
        //d imprimir ele pega o numero atualizado

        System.out.println(++numeroCompleto);
        System.out.println(numeroCompleto --);

        //como inverter o valor de uma variavel booleana, é utilizando '!', ela ''nega' o valor da variavel

        boolean variavelVerdade = true;

        variavelVerdade = !variavelVerdade;

        System.out.println(variavelVerdade);
        // aqui no imprimir também pode ser utilizado System.out.println(!variavelVerdade) para
        // a aalteração / negação da variavel.

        // operador Ternário - ?:  Expresao condicional > ?  <Caso seja true>   : <caso seja false>
        // pode usar para se uma condição for verdade imprimir algo, e se for false imperimir outro por ex

        // opção 1 (mais longa, mas também correta)
        ///
        int value1, value2;

        value1 = 5;
        value2 = 6;

        String resultado = "";{
        if(value1==value2)
            resultado = "verdadeiro";
        else
            resultado = "falsooo";
        
            System.out.println(resultado);
        }

        
        // uma opção diferente com o Operador Ternario ?: 
        
        String resultado2 = value1 == value2 ? "verdadeiro" : "false";

        System.out.println(resultado2);


    

        





    }
}
