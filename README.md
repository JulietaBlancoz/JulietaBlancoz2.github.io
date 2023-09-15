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


    //Calcular el promedio de un arreglo de numeros
public class PromedioArregloNumeros {
    public static void main (String [] args){
        double [] numeros={6.8,6.6,9.3,9.5,9.9};

        double suma=0.0;
        for (double numero:numeros) {
            suma += numero;
        }

        double promedio = suma/numeros.length;
        System.out.println("El promedio de los numeros en el arreglo es: " + promedio);

    }
    
}


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
