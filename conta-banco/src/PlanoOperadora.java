public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e insta");
            }
            
            case "B": {
                System.out.println("10 minutes");
            }
            
            break;
        
            default:
                break;
        }
        
    }
}
