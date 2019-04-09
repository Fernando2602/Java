// Programación Orientada a Objetos.
// Luis Fernando Contreras

import java.util.Scanner;

public class Tarea1_c {
    public static void main(String[] args) {
        double base, altura;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base = input.nextDouble();
        System.out.print("Introduzca la altura: ");
        altura = input.nextDouble();

        System.out.printf("Triángulo: %.2f\n", base * altura / 2);
        System.out.printf("Pentágono: %.2f\n", base * 5 * altura / 2);
    }
}
