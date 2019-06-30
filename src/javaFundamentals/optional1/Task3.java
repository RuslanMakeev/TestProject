package javaFundamentals.optional1;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = 10;

        for (int i = 0; i < a; i++){
            System.out.println(random.nextInt(500) + " ");

        }
        System.out.println();
        for (int i = 0; i < a; i++){

            System.out.print(random.nextInt(500) + " ");

        }

    }
}
