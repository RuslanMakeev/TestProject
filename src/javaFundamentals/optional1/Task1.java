package javaFundamentals.optional1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");

        String name = scanner.next();
        System.out.println("Hello, " + name);
    }
}
