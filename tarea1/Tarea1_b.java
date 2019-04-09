// Programación Orientada a Objetos.
// Luis Fernando Contreras

import java.util.Scanner;

public class Tarea1_b {
    public static void main(String[] args) {
        String name;
        Scanner input =  new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        name = input.nextLine();

        for(int i = 1; i <= 5; i++) {
            System.out.println(name);
        }
    }
}
