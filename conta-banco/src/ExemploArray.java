public class ExemploArray {
    public static void main(String[] args) {
        // indice de arrays sempre inicia com 0
        String alunos [] = {"Joao", "Jonas", "Julia", "mastodonte", "2334"};
        
        // inicialização e condição,  length = tamanho, e incremento
        for (int x = 0; x < alunos.length; x++){
            System.out.println("o aluno no indice x=" + x + "é " + alunos [x]);
        }
        

        // outra forma de usar o for.
        for(String aluno : alunos){
            System.out.println("nome do aluno é " + aluno);
        }
    }

    
}
