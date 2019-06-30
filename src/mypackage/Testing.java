package mypackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Enter matrix size: ");
        Scanner in = new Scanner(System.in);
        int matrixSize = in.nextInt();

        int[][] array = new int[matrixSize][matrixSize];

        int boundary = 100;

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = random.nextInt(boundary)*2-boundary;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println();

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

        System.out.println("Maximum is " + max);
    }
}
