
/**
 *Calcular el área de un círculo.
 * @author esthe
 */
import java.util.Scanner;


public class tareaja {
    public static void main(String [] arg) {
        Scanner teclado = new Scanner(System.in);
        double radio, diametro, area;
        System.out.println("Dame el area del circulo: ");
        radio = teclado.nextDouble();
        diametro = radio*2;
        area = (3.1416)*(radio*radio);
        System.out.println("El diametro el circulo es: " + diametro);
        System.out.println("El area el circulo es: " + area);
    }
    
}
