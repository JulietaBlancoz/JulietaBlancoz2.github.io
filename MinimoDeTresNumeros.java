//Encontrar el minimo de tres numeros en java
import java.util.Scanner;
public class MinimoDeTresNumeros{

    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
     
        System.out.println("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        int numero3 = scanner.nextInt();


        int minimo = Math.min(Math.min(numero1, numero2),numero3);

        System.out.println("El minimo de los tres numeros es: " + minimo);

scanner.close();

}
}
    
