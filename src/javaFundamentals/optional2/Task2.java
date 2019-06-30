package javaFundamentals.optional2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// Вывести числа в порядке возрастания (убывания) значений их длины.
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();

        String[] array = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number:");
            array[i] = in.next();

        }


        System.out.println();
        System.out.println("Entered numbers are: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i]);

        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }else{
                    if(o1.length() < o2.length()){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        System.out.println();
        System.out.println("Ascending numbers are: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i]);

        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return -1;
                }else{
                    if(o1.length() < o2.length()){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        System.out.println();
        System.out.println("Descending numbers are: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i]);

        }

    }

}
