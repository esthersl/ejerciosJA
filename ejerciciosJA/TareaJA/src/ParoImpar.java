
import java.util.Scanner;
/**
 *Verificar si un número es par o impar.
 * @author esthe
 */
public class ParoImpar {
      public static void main(String [] arg) {
          Scanner teclado = new Scanner(System.in);
          int n;
          System.out.print("Por favor, ingrese el numero a evaluar : ");
          n= teclado.nextInt();
          if(n % 2 ==0){
              System.out.print(n+" "+"es un numero par : ");    
          } else{
              System.out.print(n+ " "+ "no un numero par : ");  
          }
          
      }
    
}
