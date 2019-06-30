package javaFundamentals.optional2;

import java.util.Scanner;

//Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        String[] array = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.next();
        }
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i]);
        }

        int differentDigitsCount = 1;
        boolean diffDigits = false;
        int minDigitsCount = 0;
        String minStr = "";


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length(); j++) {
                if (array[i].charAt(0) != array[i].charAt(j)) {
                    if (j > 1) {
                        for (int k = 1; k < j; k++) {
                            if (array[i].charAt(j) == array[i].charAt(k)) {
                                diffDigits = true;
                            }
                        }
                        if (diffDigits == true) {
                            diffDigits = false;
                            continue;
                        }
                        else differentDigitsCount++;

                    }
                    else differentDigitsCount++;

                }
            }
            if (i == 0) {
                minDigitsCount = differentDigitsCount;
                minStr = array[i];
                diffDigits = false;
                differentDigitsCount = 1;
            }
            else if (differentDigitsCount == 1) {
                minStr = array[i];
                break;
            }
            else if (minDigitsCount > differentDigitsCount) {
                minStr = array[i];
                minDigitsCount = differentDigitsCount;
                diffDigits = false;
                differentDigitsCount = 1;

        }  else {
                diffDigits = false;
                differentDigitsCount = 1;
            }
        }
        System.out.println("Строка минимум: " + minStr);

    }

}
