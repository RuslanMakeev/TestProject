package javaFundamentals.optional2;

import java.util.Scanner;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        String[] array = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.next();
        }

        int diffDigits = 1;
        boolean sameDigits = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length(); j++) {
                if (array[i].charAt(0) != array[i].charAt(j)) {
                    if (j > 1) {
                        for (int k = 1; k < j; k++) {
                            if (array[i].charAt(j) == array[i].charAt(k)) {
                                sameDigits = true;
                                break;
                            }
                        }
                        if (sameDigits == true) {
                            sameDigits = false;
                            continue;
                        } else diffDigits++;
                    } else diffDigits++;
                }
            }
           if (diffDigits == array[i].length()) {
               System.out.println(array[i]);
               break;
           }
           else {
               diffDigits = 1;
               sameDigits = false;
           }
        }
    }
}
