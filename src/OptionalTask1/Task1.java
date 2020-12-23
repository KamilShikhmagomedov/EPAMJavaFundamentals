package OptionalTask1;

//Задание №1.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел:");
        String [] array = new String[Integer.parseInt(bufferedReader.readLine())];
        System.out.println("Введите числа");
        for (int i = 0; i < array.length; i++) {
            array[i] = bufferedReader.readLine();
        }
        int longNumberLength = 0;
        int longNumberIndex = 0;
        int shortNumberLength = array[0].length();
        int shortNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (longNumberLength < array[i].length()){
                longNumberLength = array[i].length();
                longNumberIndex = i;
            }
            if (shortNumberLength > array[i].length()){
                shortNumberLength = array[i].length();
                shortNumberIndex = i;
            }
        }
        System.out.println("Самое длинное число - " + array[longNumberIndex] + " его длина - " + longNumberLength);
        System.out.println("Самое короткое число - " + array[shortNumberIndex] + " его длина - " + shortNumberLength);
    }
}