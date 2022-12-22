package Meth1.Task5;

import java.util.Scanner;

public class Recursion {
    public static boolean eight(String word) {
        return eight(word, 0);
    }
    public static boolean eight(String word, int i) {
        if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
            i++;
            if (i < word.length()/2+1) {
                return eight(word, i);
            }
            else return true;
        }
        return false;
    }

    public static int nine(int a, int b) {
        if (a == 0) return 1;
        else if (a == 1) return b + 1;
        else if (a > 1 && b == 0) return 0;
        else return nine(a-1,b-1) + nine(a, b-1);
    }

    public static int ten(int num) {
        int res = 0;
        return ten(num/10, res*10+num%10);
    }

    public static int ten(int num, int res) {
        if (0 < num && num < 10) return res*10+num;
        return ten(num/10, res*10+num%10);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер задания (1-3 = 8-10):");
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    scn = new Scanner(System.in);
                    System.out.println("8. Введите слово: ");
                    String word = scn.nextLine();
                    if (eight(word)) System.out.println("Палиндром");
                    else System.out.println("Не палиндром");
                case 2:
                    scn = new Scanner(System.in);
                    System.out.println("\n9. Введите кол-во нулей:");
                    int a = scn.nextInt();
                    System.out.println("Введите кол-во единиц:");
                    int b = scn.nextInt();
                    System.out.println(nine(a, b));
                case 3:
                    scn = new Scanner(System.in);
                    System.out.println("Введите число для переворота:");
                    a = scn.nextInt();
                    System.out.println(ten(a));
            }
        }
    }
}
