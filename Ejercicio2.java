/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[10];
        double sumaTotal = 0;
        double promedio;
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA - EJERCICIO 2");
        System.out.println("Este programa sirve para pedir 10 numeros enteros,");
        System.out.println("sumarlos todos y sacar el promedio de ellos de forma automatica.");
        System.out.println("Instruccion: Ingrese solo numeros enteros (sin comas ni decimales).");
        System.out.println("=================================================================\n");
        for (int i = 0; i < 10; i++) {
            
            
            System.out.print("Ingrese numero real " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            sumaTotal += notas[i];
        }
        
        promedio = sumaTotal / 10;
       

        System.out.println("\n--- Resultados ---");
        System.out.printf("Suma total: %.2f%n", sumaTotal);
        System.out.printf("Promedio: %.2f%n", promedio); 
    }
}