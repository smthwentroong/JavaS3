package Meth2.Pr6.point6_11.TempTranslate;

import java.util.Scanner;

public class TestClass {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите во что переводить" +
                "(F - фаренгейт, С - Цельсия): ");
        String scale = scn.nextLine();
        System.out.print("Значение температуры: ");
        double temp = scn.nextDouble();
        TempTranslate conv = new TempTranslate();
        System.out.println(conv.convert(scale, temp));
    }
}
