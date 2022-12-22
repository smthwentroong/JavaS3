package Meth2.Pr21.point2_3;

public class UniArray<T>{
    private T uniarr[];

    public UniArray(T[] uniarr) {
        this.uniarr = uniarr;
    }

    public T getUniarrVal(int i) {
        return uniarr[i];
    }
}
