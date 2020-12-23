package OptionalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Задание №1.
//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

public class Task1 {
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

        System.out.println("Введите строку в которой упорядочить элементы");
        int chooseLine = Integer.parseInt(bufferedReader.readLine())-1;
        int tmp = 0;
        for (int i = 0; i < SIZE_MATRIX; i++) {
            if (i == chooseLine) {
                for (int j = 0; j < SIZE_MATRIX; j++) {
                    for (int k = 0; k < SIZE_MATRIX-1; k++) {
                        if (matrix[i][k] > matrix[i][k + 1]) {
                            tmp = matrix[i][k];
                            matrix[i][k] = matrix[i][k + 1];
                            matrix[i][k + 1] = tmp;
                        }
                    }
                }
            }
        }

        System.out.println("Матрица после изменений:");
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}