package MainTasks;

//Задание №3.
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rndNumbers = randomNumbers(scanner);
        System.out.println("Случайные числа с переводом строки: ");
        for (int i : rndNumbers) {
            System.out.println(i + ";");
        }
        System.out.println();
        System.out.println("Случайные числа без перевода на следующую строку: ");
        for (int i : rndNumbers) {
            System.out.print(i + "; ");
        }
    }

    private static int[] randomNumbers(Scanner scanner) {
        Random random = new Random();
        System.out.println("Введите количество чисел: ");
        int quantityOfNumbers = scanner.nextInt();
        int[] randomNumbers = new int[quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++) {
            randomNumbers[i] = random.nextInt();
        }
        return randomNumbers;
    }
}
