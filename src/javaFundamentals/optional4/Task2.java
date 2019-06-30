package javaFundamentals.optional4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
public class Task2 {
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
        int max = 0;
        int count = 1;
        int maxInRow = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if(array[i][j] < array[i][j+1]){
                    count++;
                    if (j == array.length - 2){
                        if(maxInRow < count){
                            maxInRow = count;
                            count = 1;
                        } else {
                            count = 1;
                        }
                    }
                } else {
                    if(maxInRow < count){
                        maxInRow = count;
                        count = 1;
                    }
                    else count = 1;
                }
            }
            if(i == 0){
                max = maxInRow;
                maxInRow = 0;
                count = 1;
            } else if (max < maxInRow){
                max = maxInRow;
                maxInRow = 0;
            } else {
                maxInRow = 0;
            }
        }
        System.out.println();

        System.out.println("Maximum is " + max);
    }
}

