package OptionalTask2;

//Задание №2.
//Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы");
        int SIZE_MATRIX = Integer.parseInt(bufferedReader.readLine());
        int [][] matrix = new int[SIZE_MATRIX][SIZE_MATRIX];
        Random randomNumber = new Random();
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                matrix[i][j] = randomNumber.nextInt(50);
            }
        }

        System.out.println("Заполненная матрица:");
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        int maxIndex_i = 0;
        int maxIndex_j = 0;
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    maxIndex_i = i;
                    maxIndex_j = j;
                }
            }
        }
        System.out.println("Макс. число = " + max);

        int newMatrix [][] = new int[SIZE_MATRIX-1][SIZE_MATRIX-1];
        int newIndex_i = 0;
        int newIndex_j = 0;
        for (int i = 0; i < SIZE_MATRIX; i++) {
            if (i != maxIndex_i){
                for (int j = 0; j < SIZE_MATRIX; j++) {
                    if (j != maxIndex_j){
                        newMatrix[newIndex_i][newIndex_j] = matrix[i][j];
                        newIndex_j++;
                    }
                }
                newIndex_j = 0;
                newIndex_i++;
            }
        }

        System.out.println("Матрица после изменений:");
        for (int i = 0; i < SIZE_MATRIX-1; i++) {
            for (int j = 0; j < SIZE_MATRIX-1; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}