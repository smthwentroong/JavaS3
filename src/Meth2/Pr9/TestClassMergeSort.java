package Meth2.Pr9;

import java.util.Scanner;

public class TestClassMergeSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите кол-во учеников в первой подгруппе");
        int amount1 = scn.nextInt();
        Student students1[] = new Student[amount1];
        System.out.println("Введите баллы каждого ученика по-очереди");
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student(i + 1, scn.nextDouble());
        }

        System.out.println("Введите кол-во учеников во второй подгруппе");
        int amount2 = scn.nextInt();
        Student students2[] = new Student[amount2];
        System.out.println("Введите баллы каждого ученика по-очереди");
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student(i + 1, scn.nextDouble());
        }

        System.out.println("\nДо сортировки");
        System.out.println("\n1-я подгруппа");
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i].toString());
        }
        System.out.println("\n2-я подгруппа");
        for (int i = 0; i < students2.length; i++) {
            System.out.println(students2[i].toString());
        }

        System.out.println("\nПосле сортировки и слияния");
        Student mergedStudents[] = MergeSort.mergeSort(students1, students2);
        for (int i = 0; i < mergedStudents.length; i++) {
            System.out.println(mergedStudents[i].toString());
        }

    }
}
