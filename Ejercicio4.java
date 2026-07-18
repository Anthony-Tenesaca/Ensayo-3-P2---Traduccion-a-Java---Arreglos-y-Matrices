/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA - EJERCICIO 4");
        System.out.println("Este programa sirve para pedirle 20 numeros enteros. El sistema");
        System.out.println("contara y sumara los numeros pares y los impares por separado.");
        System.out.println("Instruccion: Por favor, ingrese los valores uno por uno.");
        System.out.println("=================================================================\n");
        for (int i = 0; i < 20; i++) {
            
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}
