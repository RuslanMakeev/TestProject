package javaFundamentals.optional4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

//Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале
// значений от -M до M с помощью генератора случайных чисел (класс Random).
//1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of your matrix: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the range: ");
        int M = scanner.nextInt();

        int [][] array = new int[n][n];
        final Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(M)*2-M;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();

        System.out.println("Enter the row to be sorted: ");
        int k = scanner.nextInt();
        //System.out.println(Arrays.toString(array[k]));

        System.out.println();

        Arrays.sort(array, Comparator.comparingInt(arr -> arr[k]));

        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
