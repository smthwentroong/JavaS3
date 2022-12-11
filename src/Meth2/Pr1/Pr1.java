package Meth2.Pr1;

import java.util.Scanner;

public class Pr1 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("№1.3");
//        System.out.print("Введите кол-во элементов массива: ");
//        int n = scn.nextInt();
//        int mass[] = new int[n];
//        int sum = 0;
//        System.out.println("Введите все элементы массива: ");
//        for (int i = 0; i < n; i++) {
//            mass[i] = scn.nextInt();
//            sum+=mass[i];
//        }
//        System.out.println("Сумма элементов: " + sum);
//        System.out.println("Сумма элементов: " + (double)sum/n);
//
//
//        System.out.println("\n№1.4");
//        System.out.print("Введите кол-во элементов массива: ");
//        n = scn.nextInt();
//        mass = new int[n];
//        sum = 0;
//        int max = 0;
//        int min = Integer.SIZE;
//        while (n > 0) {
//            mass[mass.length - n - 1] = scn.nextInt();
//            if (max < mass[mass.length - n - 1]) max = mass[mass.length - n - 1];
//            if (min > mass[mass.length - n -1]) min = mass[mass.length - n -1];
//            sum += mass[mass.length - n -1];
//            n--;
//        }
//        sum = 0;
//        max = 0;
//        min = Integer.SIZE;
//        do {
//            if (max < mass[n]) max = mass[n];
//            if (min > mass[n]) min = mass[n];
//            sum += mass[n];
//            n++;
//        }
//        while(n < mass.length);
//
//        System.out.println("\n№1.5");
//        System.out.println(args.length);
//        for (int i = 0; i < args.length; i++) {
//            System.out.print(args[i] + " ");
//        }
//
//        System.out.println("\n№1.6");
//        System.out.println("\n");
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("1/%d ", i);
//        }


        System.out.println("\n№1.7");
        System.out.print("Введите число: ");
        int num = scn.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int n) {
        int res = 1;
        for(int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
