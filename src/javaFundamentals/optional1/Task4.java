package javaFundamentals.optional1;

public class Task4 {
    public static void main(String args[]) {
//        for (int i = 0; i < args.length; i++){
//            System.out.println("args[" + i + "]:" + args[i]);
//        }
        int sum = 0;
        int prz = 1;
        for (int i = 0; i < args.length; i++){
            int x = Integer.parseInt(args[i]);
            sum = sum + x;
            prz = prz * x;


        }
        System.out.println("Summa = " + sum);
        System.out.println("Proizvedenie = " + prz);


    }
}