public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperacao" :"Reprovado"; //condicoes ternarias ?:

        System.out.println(resultado);
    }
}
