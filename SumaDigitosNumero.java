//Calcular la suma de los digitos de un numero
import java.util.Scanner;
public class SumaDigitosNumero {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa un numero entero positivo ");
        int numero = scanner.nextInt();

        int suma= 0;
        while (numero >0){
            int digito = numero % 10;
            suma += digito;
            numero  /=10;
        }
        System.out.println("La suma de los digitos es: " + suma);

        scanner.close();
    }
}
