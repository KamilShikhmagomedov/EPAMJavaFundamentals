package MainTasks;

//Задание №2.
//Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        System.out.println("Ваша строка в обратном порядке: \n" + stringBuilder.reverse());
    }
}
