package javaFundamentals.optional2;

import java.util.Scanner;

//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        String[] array = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.next();
        }
        int ascCount = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 1) {
                if (i == array.length - 1) {
                    System.out.println("No numbers by ascending");
                }
                continue;
            }
            for (int j = 0; j < array[i].length()-1; j++) {
                if (array[i].charAt(j) < array[i].charAt(j+1)) {
                    ascCount++;
                }
            }
            if (ascCount == array[i].length()) {
                System.out.println(array[i]);
                break;
            }
            else  if (i == array.length - 1) {
                System.out.println("No numbers by ascending");
            }
            ascCount = 1;
        }
    }
}
