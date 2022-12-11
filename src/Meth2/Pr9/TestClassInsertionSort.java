package Meth2.Pr9;

import java.util.Scanner;

public class TestClassInsertionSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите кол-во учеников");
        int amount = scn.nextInt();
        Student students[] = new Student[amount];
        System.out.println("Введите баллы каждого ученика по-очереди");
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i+1, scn.nextDouble());
        }
        System.out.println("\nДо сортировки");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println("\nДо сортировки");
        InsertionSort.insertionSort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }
}
