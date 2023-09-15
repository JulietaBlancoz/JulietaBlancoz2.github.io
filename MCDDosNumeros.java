//Encontrar el maxcimo comun divisor de dos numeros
import java.util.Scanner;
public class MCDDosNumeros {
    public static void main( String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int numero1= scanner.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2= scanner.nextInt();

        int mcd= calcularMCD (numero1,numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
      
        scanner.close();
    }
    
}
