package sushi;

public class Chef implements Runnable {
    private Barra barra;
    public Chef (Barra barra){
        this.barra = barra;
        /*
            Thread hilo = new Thread(this);
            hilo.start();
        */
        new Thread(this, "Comenzal").start();
    }

    @Override
    public void run() {
        while(true){
            barra.poner();
        }
    }
    
}
