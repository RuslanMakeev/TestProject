package javaFundamentals.optional2;
//Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

import java.util.Scanner;

public class Task5 {
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

        int evenCount = 0;
        int oddCount = 0;
        int digitsEvenCount = 0;
        int sameDigitsCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (Character.getNumericValue(array[i].charAt(j)) % 2 == 0) {
                    evenCount++;
                }
                else oddCount++;
            }
            if (oddCount == 0) {
                digitsEvenCount++;
                evenCount = 0;
                oddCount = 0;
            }
            else if (evenCount == oddCount) {
                sameDigitsCount++;
                evenCount = 0;
                oddCount = 0;
            } else {
                evenCount = 0;
                oddCount = 0;
            }
        }
        System.out.println();
        System.out.println("The amount of all numbers with all even digits: " + digitsEvenCount);
        System.out.println("The amount of all numbers with the same amount of even and odd digits: " + sameDigitsCount);
    }
}
