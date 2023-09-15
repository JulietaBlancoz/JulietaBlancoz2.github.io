//Verificar si un numero es par o impar
import java.util.Scanner;
public class ParOImpar{
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingresa un numero entero: ");

        int numero = scanner.nextInt();

        if (numero % 2== 0) {

        System.out.println(numero + "Es un número par");

        } else {
            System.out.println(numero + "Es un número impar");
        }
scanner.close();
    }
}
    
