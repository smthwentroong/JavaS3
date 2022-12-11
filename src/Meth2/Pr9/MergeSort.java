package Meth2.Pr9;

import static java.lang.System.arraycopy;

public class MergeSort {
    static Student students1[];
    static Student students2[];

    static Student res[];

    private static Student[] merge(Student stds1[], Student stds2[]) {
        res = new Student[stds1.length + stds2.length];
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

    private static Student[] sort(Student students[]) {
        if (students == null) return null;
        if (students.length < 2) return students;
        Student stds1[] = new Student[students.length/2];
        arraycopy(students,0, stds1,0, students.length/2);

        Student stds2[] = new Student[students.length - students.length/2];
        arraycopy(students,students.length/2,
                stds2,0, students.length - students.length/2);

        stds1 = sort(stds1);
        stds2 = sort(stds2);

        return merge(stds1, stds2);
    }

    public static Student[] mergeSort(Student studs1[], Student studs2[]){
        students1 = studs1;
        students2 = studs2;
        students1 = sort(students1);
        students2 = sort(students2);
        res = merge(students1, students2);
        return res;
    }


}
