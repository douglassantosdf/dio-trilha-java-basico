public class FormatadorCepExemplo {
    public static void main (String [] args){
        try {
            String cepFormatado = formatarCep("123413217");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //o catch trata a excecao, como é do tipo exceptions ele me obriga a tratar agora com try/catch
            System.out.println("nao sao 8 numeros");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulando um cep formatado
            return "23.765-064";
    }
}
