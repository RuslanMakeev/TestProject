package mypackage;

import java.util.Scanner;

class TestClass {

    public static void main(String[] args) {
        long n;
        int differentDigitsCount = 0;
        int[] digitsCount = new int[10];
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextLong();

        while (n!=0)
        {
            digitsCount[(int)(n%10)]++;
            n/=10;
        }
        for (int i = 0; i < 10; i++)
        {
            if (digitsCount[i] > 0) differentDigitsCount++;
        }

        System.out.println(differentDigitsCount);


    }
}
