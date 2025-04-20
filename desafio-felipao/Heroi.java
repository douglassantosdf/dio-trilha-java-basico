public class Heroi{
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome,int idade,String tipo){
        this.nome  = nome;
        this.idade = idade;
        this.tipo  = tipo.toLowerCase(); //coloca tudo minusculo
    }


public void atacar(){
        String ataque;

    switch(tipo){
        case "mago":
            ataque = "usou magia";
            break;
        case "guerreiro":
            ataque = "usou espada";
            break;
        case "monge":
            ataque = "usou artes marciais";
            break;
        case "ninja":
            ataque = "usou shuriken";
            break;
        default:
            ataque = "usou ataque desconhecido";
    }
    //eixibe a mensagem a cada ataque
    System.out.println("O " + tipo + " atacou usando " + ataque);
}

public static void main(String[] args){


    Heroi heroi1 = new Heroi("Levi", 22, "Mago");
    Heroi heroi2 = new Heroi("gojo", 25, "guerreiro");
    Heroi heroi3 = new Heroi("bleach", 22, "monge");
    Heroi heroi4 = new Heroi("azure", 39, "ninja");
    
    heroi1.atacar();
    heroi2.atacar();
    heroi3.atacar();
    heroi4.atacar();
    
    
    }
}