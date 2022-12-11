package Meth2.Pr18.point2;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            String intString = scn.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(NumberFormatException e){
            System.out.println("Некорректный формат ввода целочисленного значения");
        }
    }
}