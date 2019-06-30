package javaFundamentals.optional2;

import java.util.Scanner;
// Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
public class Task3 {
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

        double avr = 0;
        for (int i = 0; i < array.length; i++) {
            avr = avr + array[i].length();
        }
        avr = avr / numbers;
        System.out.println("Average length: " + avr);
        System.out.println();

//*********************Текст + вывод чисел меньшей длины, чем средняя********************************************

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < avr) {
                System.out.println("Numbers that are SHORTER than the average length for all numbers: ");
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < avr) {
                System.out.println(array[i] + " with length " + array[i].length());
            }
        }
        System.out.println();
//*********************Текст + вывод чисел большей длины, чем средняя********************************************

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > avr) {
                System.out.println("Numbers that are LONGER than the average length for all numbers: ");
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > avr) {
                System.out.println(array[i] + " with length " + array[i].length());
            }
        }
//*********************Текст + вывод чисел в случае одинаковой длины********************************************
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == avr) {
                System.out.println("All numbers have the same length = " + array[i].length());
                break;
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == avr) {
                System.out.println(array[i]);
            }

        }

    }

}

