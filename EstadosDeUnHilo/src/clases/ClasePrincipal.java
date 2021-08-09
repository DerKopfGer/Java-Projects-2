package clases;


public class ClasePrincipal {
    public static void main(String args[]){
        
        Hilo_Proceso hilouno = new Hilo_Proceso();
        Hilo_Proceso hilodos = new Hilo_Proceso();
        
        hilouno.start();
        try{
            
        hilouno.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Error en el hilo 1" + e);
        }
        hilodos.start();
        hilodos.stop();
        try{
            hilodos.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }
        
    }
}
