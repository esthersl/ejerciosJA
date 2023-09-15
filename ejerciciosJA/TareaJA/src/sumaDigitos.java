
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Calcular la suma de los dígitos de un número.
 * @author esthe
 */
public class sumaDigitos {
     public static void main(String [] arg) {
          Scanner teclado = new Scanner(System.in);
          int numero, SumaDig =0;
          System.out.print("Por favor, ingrese el numero a evaluar : ");
          numero = teclado.nextInt();
          int aux= numero;
          while(numero != 0){
            SumaDig = SumaDig + (numero % 10);
            numero = numero /10;
            
          }
         System.out.println("La suma de los digitos  " + aux + " "+ "es " + SumaDig ); 
     }
    
}
