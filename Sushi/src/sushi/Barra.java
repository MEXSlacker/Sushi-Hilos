package sushi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grave
 */
public class Barra {
    private int n;  //saber cuantos sushis hay
    private boolean ocupado;
    
    public Barra(){
        n=0;
        ocupado=false;
    }
    
    // monitor ilegal exception, siempre sucedera cuando trates de acceder a una seccion no syncronizada
    public synchronized void poner(){
        if(ocupado){
            try {
                wait();
            } catch (InterruptedException ex) {}
        }
        ocupado=true;
        n++;
        System.out.println("Sushi servido...");
        ocupado = false;
        notify();
    }
    
    
    public synchronized void tomar(){
        while(ocupado || n<1){
            try {
                wait();
            } catch (InterruptedException ex) {}
        }
        ocupado=true;
        n--;
        System.out.println("Comiendo sushis");
        ocupado = false;
        notify();
    }
    
}
