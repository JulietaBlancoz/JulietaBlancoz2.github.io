//Verificar si un año es bisisesto o no
import java.util.Scanner;
public class AnoBisiestoONo{

public static void main (String [] args) {
 
Scanner scanner = new Scanner (System.in);

System.out.print("Ingrese un año: ");  
int ano = scanner.nextInt();  

boolean esBisiesto = (ano % 4== 0 && ano % 100 !=0) || (ano % 400 == 0);
    
if (esBisiesto) {
    System.out.println(ano + "  es un año bisiesto ");

} else {
    System.out.println(ano + "  no es un año bisiesto ");
}


scanner.close();
}
}