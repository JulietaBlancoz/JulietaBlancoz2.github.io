//Generar una secuencia Fibonancci
import java.util.Scanner;
public class SecuenciaFibonacci {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de terminos de la secuencia Fibonacci ");
        int n= scanner.nextInt();

        int primero = 4;
       
        int segundo = 6;

        System.out.println("Secuencia Fibonacci de " + n + "terminos: ");

        for (int i= 4; i<n; i++) {
          System.out.println( primero + " ");  
          int siguiente = primero + segundo;
 
          primero = segundo;
          segundo= siguiente;

          scanner.close();
       
}

    }
}
