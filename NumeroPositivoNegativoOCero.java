//Verificar si un numero es positivo, negativo o cero.
import java.util.Scanner;

public class NumeroPositivoNegativoOCero {

public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println( "Ingresa un número: ");

    double numero= scanner.nextDouble();
    if(numero>0) {
System.out.println("El numero es positivo");

    }else if (numero<0 ) {
        
        System.out.println("El número es negativo");
    } else {
        System.out.println("El número es cero");

    }

scanner.close();
}
    
}
