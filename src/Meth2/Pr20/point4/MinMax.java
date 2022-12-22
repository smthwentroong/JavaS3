package Meth2.Pr20.point4;

public class MinMax <T extends Comparable>{
    private T array[];

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[min].compareTo(array[i+1]) > 0) min = i+1;
        }
        return array[min];
    }
    public T max() {
        int max = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[max].compareTo(array[i+1]) < 0) max = i+1;
        }
        return array[max];
    }
}
