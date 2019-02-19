// Programación Orientada a Objetos.
// Luis Fernando Contreras

import java.util.Scanner;

public class Tarea2_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, j = 0, k = 1;

        System.out.print("Introduzca un entero: ");
        limite = input.nextInt();

        for(int i = 1; i <= limite; i++) {
            k = k + j;
            System.out.printf("%d ", j);
            j = k - j;
        }
    }
}
