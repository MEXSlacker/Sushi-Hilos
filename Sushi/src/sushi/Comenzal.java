package sushi;

/**
 *
 * @author grave
 */
public class Comenzal implements Runnable {
    private Barra barra;
    public Comenzal (Barra barra){
        this.barra = barra;
        /*
            Thread hilo = new Thread(this);
            hilo.start();
        */
        new Thread(this, "Chef").start();
    }

    @Override
    public void run() {
        while(true){
            barra.tomar();
        }
    }
}
