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
