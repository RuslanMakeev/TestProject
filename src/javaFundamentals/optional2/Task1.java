package javaFundamentals.optional2;

import java.util.Scanner;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter amount of numbers: ");
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();

        String[] array = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number:");
            array[i] = in.next();

        }
        int min = array[0].length(), max = 0;


        System.out.println();
        System.out.println("Entered numbers are: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i]);

        }
        System.out.println();
        String minStr = array[0];
        String maxStr = "";

        for (String ln : array) {
            if (ln.length() < min) {
                min = ln.length();
                minStr = ln;
            }
            else if (ln.length() > max) {
                max = ln.length();
                maxStr = ln;
            }

        }

//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() < min) {
//                min = array[i].length();
//                minStr = array[i];
//
//            }
//            if (array[i].length() > max) {
//                max = array[i].length();
//                maxStr = array[i];
//            }
//
//
//        }

        System.out.println("The shortest one is: " + minStr + "; Length: " + min);
        System.out.println("The longest one is: " + maxStr + "; Length: " + max);
    }

}