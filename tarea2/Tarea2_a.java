// Programación Orientada a Objetos.
// Luis Fernando Contreras

import java.util.Scanner;

public class Tarea2_a {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner input =  new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número: ");
            numeros[i] = input.nextInt();
        }

        insertionSort(numeros);
    }

    public static void insertionSort(int[] numeros) {
        int key, i;

        for(int j = 1; j < numeros.length; j++) {
            key = numeros[j];
            i = j - 1;

            while (i >= 0 && numeros[i] >= key) {
                numeros[i + 1] = numeros[i];
                i -= 1;
            }
            numeros[i + 1] = key;
        }

        for(int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
    }
}
