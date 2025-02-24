import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
// scanner usado para pegar conteudo do usuario
// locale para padrao amaericano

public class AboutMe {
    public static  void main (String [] args){
        try{
            
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo o que o usuario colocoy
        System.out.println("Ola, meu nome é "+ nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println( "Tenho " + altura + "cm de altura");

        scanner.close();

        }
        catch (InputMismatchException e){
            System.out.println("os campos idade e altura tem que ser numericos");
        }



     
        
    }
}
