package sushi;
public class Sushi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barra barra = new Barra();
        new Chef(barra);
        
        new Comenzal(barra);
    }
    
}
