package Meth2.Pr3.task1;

import java.util.Random;

public class point3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int mass[] = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = rand.nextInt(10,99);
            System.out.println(mass[i]);
        }
        for (int i = 1; i <= 4; i++) {
            if (mass[i-1] > mass[i]) {
                System.out.println("Не возрастает");
                return;
            }
        }
        System.out.println("Возрастает");
    }
}
