package Meth2.Pr10;

import java.util.Scanner;

import static java.lang.System.arraycopy;

public class SortingStudentsByGPA {
    public static Student idNumber[];
    public static Student year[];
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите кол-во студентов: ");
        int stds = scn.nextInt();
        setArrays(stds);
        System.out.println("\nДо быстрой сортировки:");
        outArray(idNumber);
        quickSort(0, stds-1);
        System.out.println("\nПосле быстрой сортировки:");
        outArray(idNumber);

        System.out.println("\nДо сортировки слиянием:");
        outArray(year);
        year = mergeSort(year);
        System.out.println("\nПосле сортировки слиянием:");
        outArray(year);

        System.out.println("\nРезультат слияния двух массивов");
        Student allStds[] = merge(idNumber, year);
        outArray(allStds);
    }

    public static void setArrays(int stds) {
        idNumber = new Student[stds];
        year = new Student[stds];
        for (int i = 0; i < stds; i++) {
            idNumber[i] = new Student("Имя"+(i+1),
                    "Фамилия"+(i+1), "Специальность"+(i+1),
                    (int)Math.ceil(Math.random()*10),
                    "Группа"+(int)Math.ceil(Math.random()*10), Math.random()*100, 0);
        }

        for (int i = 0; i < stds; i++) {
            year[i] = new Student("Имя"+(i+1),
                    "Фамилия"+(i+1), "Специальность"+(i+1),
                    (int)Math.ceil(Math.random()*10),
                    "Группа"+(int)Math.ceil(Math.random()*10), Math.random()*100, 1);
        }
    }

    public static void quickSort(int left, int right) {
        if (idNumber.length == 0) return;
        if (left >= right) return;

        Student mid = idNumber[(int)(left + (right - left)/2)];

        int i = left;
        int j = right;
        while (i <= j) {
            while(idNumber[i].compareTo(mid) > 0) i++;
            while(idNumber[j].compareTo(mid) < 0) j--;

            if (i <= j) {
                Student tmp = idNumber[i];
                idNumber[i] = idNumber[j];
                idNumber[j] = tmp;
                i++;
                j--;
            }
        }
        if (left < j) quickSort(left, j);
        if (right > i) quickSort(i, right);
    }

    public static Student[] merge(Student stds1[], Student stds2[]) {
        Student[] res = new Student[stds1.length + stds2.length];
        int left = 0;
        int curr = 0;
        int right = 0;
        while (left < stds1.length && right < stds2.length) {
            if (stds1[left].compareTo(stds2[right]) < 0)
                res[curr++] = stds1[left++];
            else res[curr++] = stds2[right++];
        }
        if (left < stds1.length)
            arraycopy(stds1, left, res, curr, stds1.length - left);
        else if (right < stds2.length)
            arraycopy(stds2, right, res, curr, stds2.length - right);
        return res;
    }

    public static Student[] mergeSort(Student students[]) {
        if (students == null) return null;
        if (students.length < 2) return students;
        Student stds1[] = new Student[students.length/2];
        arraycopy(students,0, stds1,0, students.length/2);

        Student stds2[] = new Student[students.length - students.length/2];
        arraycopy(students,students.length/2,
                stds2,0, students.length - students.length/2);

        stds1 = mergeSort(stds1);
        stds2 = mergeSort(stds2);

        return merge(stds1, stds2);
    }

    public static void outArray(Student array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
