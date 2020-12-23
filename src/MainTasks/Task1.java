package MainTasks;

//Задание №1.
//Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя.");
        Scanner scanner = new Scanner(System.in);
        String nameJoinUser = scanner.nextLine();
        System.out.println("Привет, " + nameJoinUser + "!");
    }
}
