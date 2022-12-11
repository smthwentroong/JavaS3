package Meth2.Pr3.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class point4 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        int n;
        do {
            System.out.println("Введите кол-во элементов массива (>1)");
            n = scn.nextInt();
        }
        while(n <= 1);

        int origin[] = new int[n];
        for (int i = 0; i < n; i++) {
            origin[i] = rand.nextInt(1000);
        }

        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (origin[i]%2 == 0) evens.add(origin[i]);
        }

        System.out.println(evens);
    }
}
