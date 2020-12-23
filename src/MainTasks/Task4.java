package MainTasks;

//Задание №4.
//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int [] array = new int[scanner.nextInt()];
        System.out.println("Введите числа");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int summ = 0;
        int composition = 1;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
            composition *= array[i];
        }
        System.out.println("Сумма чисел - " + summ);
        System.out.println("Произведение чисел - " + composition);
    }
}
