package Meth2.Pr9;

public class QuickSort {
    static Student students[];
    public static Student[] quickSort(Student newStudents[]) {
        students = newStudents;
        quickSort(0, students.length-1);
        return students;
    }
    public static void quickSort(int left, int right) {
        if (students.length == 0) return;
        if (left >= right) return;

       Student mid = students[(int)(left + (right - left)/2)];

        int i = left;
        int j = right;
        while (i <= j) {
            while(students[i].compareTo(mid) > 0) i++;
            while(students[j].compareTo(mid) < 0) j--;

            if (i <= j) {
                Student tmp = students[i];
                students[i] = students[j];
                students[j] = tmp;
                i++;
                j--;
            }
        }
        if (left < j) quickSort(left, j);
        if (right > i) quickSort(i, right);
    }
}
