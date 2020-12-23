package OptionalTask1;

//Задание №2.
//Вывести числа в порядке возрастания (убывания) значений их длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел:");
        String [] array = new String[Integer.parseInt(bufferedReader.readLine())];
        System.out.println("Введите числа");
        for (int i = 0; i < array.length; i++) {
            array[i] = bufferedReader.readLine();
        }
        String tmp = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].length() < array[j+1].length()){ // В зависимости от знака здесь будет убывание/возрастание
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (String arr : array){
            System.out.println(arr);
        }
    }
}