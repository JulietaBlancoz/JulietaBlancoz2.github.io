//Calcular el area de un circulo
import java.util.Scanner;
public class CalculoAreaCirculo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingresa el radio del circulo: ");

        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio,2);

        System.out.println ("El área del círculo con radio" + radio + " es:" + area);

        scanner.close();
    }
}


