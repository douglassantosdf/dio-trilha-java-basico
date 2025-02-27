package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"felipe","marcio","Maria","julia","Agusto"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);

        }
        imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando) { 
                tentativasRealizadas++;
                
            }else
            System.out.println("contato realizado com sucesso");
                //tem que ter alterações para nao ter loop infinito
        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu) {
            System.out.println("conseguimos contato com " +candidato + " NA " + tentativasRealizadas + " Tentativa");
        }else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
        

         

    }

    //metodo auxiliar para o toque se o numero entre 1 e 3 for de 1, ele atendeu, este é para gerar o randomico para ligação
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"felipe","marcio","Maria","julia","Agusto"};

        System.out.println("imprimindo a lista de candidatos informando o indice de elementro");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("o candidato de n°"+ (indice+1) + "é o "+ candidatos[indice]);
        }

        System.out.println("forma abrevida de interação for each");

        for(String candidato: candidatos){
            System.out.println("o candidato foi "+ candidato);
        }
    }



    static void selecaoCandidatos(){
        //array para candidatos
        String [] candidatos = {"Felipe", "marcia", "Paulo", "Joaquim","Daniela","maria","Luiza"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + "solicitou o valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("o candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    // CRIANDO METODO PARA TESTAR OS VALORES PRETENDIDOS

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
