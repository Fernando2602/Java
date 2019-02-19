// Programación Orientada a Objetos.
// Luis Fernando Contreras

import java.security.SecureRandom;

public class Tarea2_c {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        insertionSort(numbers);
    }

    public static void insertionSort(int[] numbers) {
        int key, i;

        for(int j = 1; j < numbers.length; j++) {
            key = numbers[j];
            i = j - 1;

            while (i >= 0 && numbers[i] >= key) {
                numbers[i + 1] = numbers[i];
                i -= 1;
            }
            numbers[i + 1] = key;
        }

        for(int index = 0; index < numbers.length; index++) {
            System.out.printf("%d ", numbers[index]);
        }
            System.out.println("");
    }
}
