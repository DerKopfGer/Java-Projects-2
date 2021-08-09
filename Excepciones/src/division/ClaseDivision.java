package division;
import java.util.Scanner;

public class ClaseDivision {
   public static void main(String args[]){
       
       try{
         //código
       int valor1, valor2, resultado;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Dame tu primer valor");
       valor1 = entrada.nextInt();
       
       System.out.println("Dame el segundo valor");
       valor2 = entrada.nextInt();
       
       resultado = valor1 / valor2;
       
       System.out.println("El resultado de tu division es: " + resultado);
       } catch (Exception e){
           //comportamiento de errores que no tengamos previsto
           System.out.println("Error!!!!! " + e);
       } finally {
           System.out.println("Operación concluida!!");
       }
          
       

   }
}
