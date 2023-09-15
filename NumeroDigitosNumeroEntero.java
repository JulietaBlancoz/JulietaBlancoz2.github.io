//Calcular el numero de digitos de un numero entero
import java.util.Scanner;

public class NumeroDigitosNumeroEntero {
    
public static void main (String [] args) {

Scanner scanner = new Scanner (System.in);

System.out.print("Ingrese un numero entero: ");  
int numero = scanner.nextInt();

String numeroComoCadena = String.valueOf(numero);

 int numeroDeDigitos = numeroComoCadena.length();

 System.out.println("El numero de digitos en " + numero + " es: " + numeroDeDigitos);

 scanner.close();
}
}
